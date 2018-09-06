package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicPlaying extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_hiphop, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                // Return to previous activity
                finish();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playing);

        TextView songName = (TextView)findViewById(R.id.song_Name);
        TextView artistName = (TextView)findViewById(R.id.artist_Name);
        ImageView songPic = (ImageView) findViewById(R.id.song_Image);

        Bundle bundle = getIntent().getExtras();
        MusicItems itemClicked = (MusicItems) bundle.getSerializable("Music Items");

        songName.setText(itemClicked.getSongName());
        artistName.setText(itemClicked.getSongArtist());
        songPic.setImageResource(itemClicked.getSongPic());

    }
}
