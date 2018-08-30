package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking view in xml to variable in java
        CardView listenHiphop = (CardView) findViewById(R.id.hiphop);
        CardView listenJazz = (CardView) findViewById(R.id.jazz);
        CardView listenBlues = (CardView) findViewById(R.id.blues);
        CardView listenRaggae = (CardView) findViewById(R.id.reggae);

        //Method to open Hiphop Activity when card is click
        listenHiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hiphopIntents = new Intent(MainActivity.this, Hiphop.class);
                startActivity(hiphopIntents);
            }
        });

        //Method to open Jazz Activity when card is click
        listenJazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jazzIntents = new Intent(MainActivity.this, Jazz.class);
                startActivity(jazzIntents);
            }
        });

        //Method to open Blues Activity when card is click
        listenBlues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bluesIntents = new Intent(MainActivity.this, Blues.class);
                startActivity(bluesIntents);
            }
        });

        //Method to open Raggae Activity when card is click
        listenRaggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent raggaeIntents = new Intent(MainActivity.this, Raggae.class);
                startActivity(raggaeIntents);
            }
        });
    }
}
