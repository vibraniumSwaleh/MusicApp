package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Raggae extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //Array of Raggae songs
        ArrayList<MusicItems> musicItems = new ArrayList<MusicItems>();

        //Assigning images and text to musicItem array
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));
        musicItems.add(new MusicItems(R.drawable.reggae, "minto wuksus","minto"));


        com.example.android.musicapp.MusicAdapter itemsAdapter = new com.example.android.musicapp.MusicAdapter(this, musicItems);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(itemsAdapter);
    }
}
