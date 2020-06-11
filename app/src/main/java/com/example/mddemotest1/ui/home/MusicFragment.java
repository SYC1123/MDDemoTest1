package com.example.mddemotest1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mddemotest1.Music;
import com.example.mddemotest1.MusicAdapter;
import com.example.mddemotest1.R;

import java.util.ArrayList;
import java.util.List;

public class MusicFragment extends Fragment {


    private List<Music> musicList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initmusic();
        MusicAdapter fruitAdapter = new MusicAdapter(getContext(), R.layout.music_item, musicList);
        ListView listView = root.findViewById(R.id.list);
        listView.setAdapter(fruitAdapter);
        return root;
    }

    private void initmusic() {
        for (int i = 0; i < 5; i++) {
            Music music = new Music("「电子音乐」-提神醒脑", R.drawable.musicba2);
            musicList.add(music);
            Music music1 = new Music("「华语音乐」-华语精品", R.drawable.musicba1);
            musicList.add(music1);
            Music music2 = new Music("「睡前音乐」-助眠精选", R.drawable.musicba);
            musicList.add(music2);
        }
    }
}
