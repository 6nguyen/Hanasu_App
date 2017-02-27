package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/27/2017.
 */

public class fragmentGreetings extends Fragment{

    public fragmentGreetings(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        ArrayList<Word> words = new ArrayList<Word>();

        /** Greetings */
        words.add(new Word("Hello", "Konichiwa", R.raw.konichiwa));
        words.add(new Word("Goodbye", "Sayonara", R.raw.sayonara));
        words.add(new Word("Good morning", "Ohayo gozaimasu", R.raw.ohayou_goazimasi));
        words.add(new Word("Good night", "Oyasuminasai", R.raw.oyasuminasai));
        words.add(new Word("I'm leaving", "Ittekmasu", R.raw.ittekimasu));
        words.add(new Word("I'm home", "Tadaima", R.raw.tadaima));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_greetings);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}

