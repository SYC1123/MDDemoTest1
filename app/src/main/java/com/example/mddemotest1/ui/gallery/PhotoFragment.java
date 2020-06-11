package com.example.mddemotest1.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mddemotest1.DataSource;
import com.example.mddemotest1.MainAdapter;
import com.example.mddemotest1.Photo_Item;
import com.example.mddemotest1.R;

import java.util.ArrayList;
import java.util.List;


public class PhotoFragment extends Fragment {

    private List<Photo_Item> fruitList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private MainAdapter mAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.main_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new MainAdapter(DataSource.generateData(6));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
        return root;
    }
    private void initfruit() {
        for (int i = 0; i < 10; i++) {
            Photo_Item fruit = new Photo_Item("aaa", R.drawable.w);
            fruitList.add(fruit);
        }
    }
}
