package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicapp.MusicItems;
import com.example.android.musicapp.R;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<MusicItems> {

    private static final String LOG_TAG = MusicAdapter.class.getSimpleName();

    public MusicAdapter(Activity context, ArrayList<MusicItems> numbersName) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numbersName);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        MusicItems currentPosition = getItem(position);

        TextView songName = (TextView) listItemView.findViewById(R.id.textView1);
        songName.setText(currentPosition.getSongName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.textView2);
        artistName.setText(currentPosition.getSongArtist());

        ImageView songPic = (ImageView) listItemView.findViewById(R.id.image);
        songPic.setImageResource(currentPosition.getSongPic());

        return listItemView;

    }
}