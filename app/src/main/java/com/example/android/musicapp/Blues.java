package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.text.FieldPosition;
import java.util.ArrayList;

public class Blues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //Array of Blues songs
        final ArrayList<MusicItems> musicItems = new ArrayList<MusicItems>();

        //Assigning images and text to musicItem array
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.blues, "minto wuksus","minto"));


        com.example.android.musicapp.MusicAdapter itemsAdapter = new com.example.android.musicapp.MusicAdapter(this, musicItems);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(itemsAdapter);

        //Opening another activity when ListView item is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                MusicItems itemClicked = musicItems.get(i);

                Bundle bundle = new Bundle();
                bundle.putSerializable("Music Items", itemClicked);

                Intent listViewClicked = new Intent(Blues.this, MusicPlaying.class);
                listViewClicked.putExtras(bundle);
                startActivity(listViewClicked);
            }
        });

    }
}
