package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playing);


        TextView songName = (TextView)findViewById(R.id.song_Name);
        TextView artistName = (TextView)findViewById(R.id.artist_Name);
        ImageView songPic = (ImageView) findViewById(R.id.song_Image);

        Bundle bundle = getIntent().getExtras();
        MusicItems itemOne = (MusicItems) bundle.getSerializable("Music Items");

        songName.setText(itemOne.getSongName());
        artistName.setText(itemOne.getSongArtist());
        songPic.setImageResource(itemOne.getSongPic());

    }
}
