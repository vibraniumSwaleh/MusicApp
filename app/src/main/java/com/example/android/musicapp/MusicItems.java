package com.example.android.musicapp;

public class MusicItems  {

    //class states/variables
    private String mSongName;
    private String mSongArtist;
    private int mSongPic;

    //word constructor
    public MusicItems(int songPic, String songName, String songArtist){
        mSongName = songName;
        mSongArtist = songArtist;
        mSongPic = songPic;
    }

    //return song name
    public String getSongName(){
        return mSongName;
    }

    //return song artist name
    public String getSongArtist(){
        return mSongArtist;
    }

    //return song artist picture
    public int getSongPic(){ return mSongPic;}

    }

