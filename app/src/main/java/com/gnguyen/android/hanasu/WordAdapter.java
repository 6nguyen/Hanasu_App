package com.gnguyen.android.hanasu;

//app/src/main/java/com/example/android/hanasu/WordAdapter.java
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.support.v4.content.ContextCompat;
import android.media.MediaPlayer;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/2/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

// Resource ID for this word list's background color
    private int mColorResourceId;

// Constructor
   public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor){
       super(context, 0, words);
       mColorResourceId = backgroundColor;
    }

// getView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                                                    R.layout.list_item,
                                                    parent,
                                                    false);
        }

        Word currentWord = getItem(position);

        // Display Japanese translation of word
        TextView japaneseTextView = (TextView)listItemView.findViewById(R.id.japanese_text_view);
        japaneseTextView.setText(currentWord.getJapanese());

        // Display English Translation of word
        TextView englishTextView = (TextView)listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getEnglish());

        // Display image associated with word or remove image view if no image associated
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        // Set theme color of this list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find color that resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        // set background color for text container
        textContainer.setBackgroundColor(color);

        ImageButton play_Icon = (ImageButton)listItemView.findViewById(R.id.play_Icon);
        final MediaPlayer mp = MediaPlayer.create(this.getContext(), currentWord.getmAudioResrouceId());
        play_Icon.setBackgroundColor(color);
        play_Icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()){
                    mp.pause();
                } else {
                    mp.start();
                }
            }
        });


        return listItemView;
    }
}
