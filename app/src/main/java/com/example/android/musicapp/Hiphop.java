package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Hiphop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //Array of Hiphop songs
        ArrayList<MusicItems> musicItems = new ArrayList<MusicItems>();

        //Assigning images and text to musicItem array
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.hiphop, "minto wuksus","minto"));


        com.example.android.musicapp.MusicAdapter itemsAdapter = new com.example.android.musicapp.MusicAdapter(this, musicItems);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(itemsAdapter);

        //Opening another activity when ListView item is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent listViewClicked = new Intent(Hiphop.this, MusicPlaying.class);
                startActivity(listViewClicked);
            }
        });
    }
}
