package com.example.android.miwok;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/2/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

// Constructor
   public WordAdapter(Activity context, ArrayList<Word> words){
       super(context, 0, words);
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

        TextView japaneseTextView = (TextView)listItemView.findViewById(R.id.japanese_text_view);
        japaneseTextView.setText(currentWord.getJapanese());

        TextView englishTextView = (TextView)listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getEnglish());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
