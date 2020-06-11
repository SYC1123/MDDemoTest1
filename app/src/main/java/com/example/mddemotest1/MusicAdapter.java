package com.example.mddemotest1;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.util.List;


public class MusicAdapter extends ArrayAdapter<Music> {
    private int resourceId;

    public MusicAdapter(Context context, int resourceid, List<Music> objects) {
        super(context, resourceid, objects);
        resourceId = resourceid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Music fruit = getItem(position); // 获取当前项的Fruit实例
        View view;
//提升ListView的运行效率，可以看到，现在我们在 getView()方法中进行了判断，如果 convertView为空，则使用LayoutInflater去加载布局，如果不为空则直接对 convertView进行重用。这样就大大提高了 ListView的运行效率，在快速滚动的时候也可以表现出更好的性能。
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        } else {
            view = convertView;
        }

        ConstraintLayout fruitImage = (ConstraintLayout) view.findViewById(R.id.musicbackground);
        TextView fruitName = (TextView) view.findViewById(R.id.name);
//        Drawable drawable = ContextCompat.getDrawable(getContext(),fruit.getImageId());
//        fruitImage.setBackground(drawable);
        fruitImage.setBackgroundResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }

}



