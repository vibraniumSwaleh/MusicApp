package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Jazz extends AppCompatActivity {

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
        setContentView(R.layout.music_list);

        //Array of Jazz songs
        final ArrayList<MusicItems> musicItems = new ArrayList<MusicItems>();

        //Assigning images and text to musicItem array
        musicItems.add(new MusicItems(R.drawable.alliwant, "All I Want","Jessy J"));
        musicItems.add(new MusicItems(R.drawable.perfectduet, "Perfect Duet","Postmodern Jukebox"));
        musicItems.add(new MusicItems(R.drawable.badatlove, "Bad At Love","Postmodern Jukebox"));
        musicItems.add(new MusicItems(R.drawable.for2akis, "For 2 Akis","Shinya Fukumori"));
        musicItems.add(new MusicItems(R.drawable.fistsoffury, "Fists of Fury","Kamasi Washington"));
        musicItems.add(new MusicItems(R.drawable.thiswillbe, "This Will Be (An Everlasting Love)","Dave Koz"));

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

                Intent listViewClicked = new Intent(Jazz.this, MusicPlaying.class);
                listViewClicked.putExtras(bundle);
                startActivity(listViewClicked);
            }
        });
    }
}
