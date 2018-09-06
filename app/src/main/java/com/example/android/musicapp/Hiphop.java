package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class Hiphop extends AppCompatActivity {

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

        //Array of Hiphop songs
        final ArrayList<MusicItems> musicItems = new ArrayList<MusicItems>();

        //Assigning images and text to musicItem array
        musicItems.add(new MusicItems(R.drawable.godsplan, "God's Plan", "Drake"));
        musicItems.add(new MusicItems(R.drawable.niceforwhat, "Nice For What", "Drake"));
        musicItems.add(new MusicItems(R.drawable.apes, "APES**T", "The Carters"));
        musicItems.add(new MusicItems(R.drawable.topoff, "Top Off", "DJ Khaled"));
        musicItems.add(new MusicItems(R.drawable.luciddreams, "Lucid Dreams", "Juice Wrld"));
        musicItems.add(new MusicItems(R.drawable.bigbank, "Big Bank", "YG"));
        musicItems.add(new MusicItems(R.drawable.yesindeed, "Yes Indeed", "Lib Baby"));
        musicItems.add(new MusicItems(R.drawable.imupset, "I'm Upset", "Drake"));
        musicItems.add(new MusicItems(R.drawable.rockstar, "Rockstar", "Post Malone"));
        musicItems.add(new MusicItems(R.drawable.lookalive, "Look Alive", "BlocBoy JB"));


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

                Intent listViewClicked = new Intent(Hiphop.this, MusicPlaying.class);
                listViewClicked.putExtras(bundle);
                startActivity(listViewClicked);
            }
        });
    }
}
