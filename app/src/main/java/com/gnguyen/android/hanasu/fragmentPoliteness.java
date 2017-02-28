package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/27/2017.
 */

public class fragmentPoliteness  extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Politeness */
        words.add(new Word("Thank you", "Doumo arigato gozaimasu!", R.raw.doumo_arigato_gozaimasu));
        words.add(new Word("You're welcome", "Dou itashimashite", R.raw.dou_itashimashite));
        words.add(new Word("Sorry", "Gomennasai", R.raw.gomennasai));
        words.add(new Word("Go Ahead", "Dozo", R.raw.dozo));
        words.add(new Word("Excuse me", "Sumimasen", R.raw.sumimasen));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_politeness);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
