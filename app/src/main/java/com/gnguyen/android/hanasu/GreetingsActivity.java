package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by gnguy on 2/17/2017.
 */

public class GreetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Greetings */
        words.add(new Word("Hello", "Konichiwa", R.raw.konichiwa));
        words.add(new Word("Goodbye", "Sayonara", R.raw.sayonara));
        words.add(new Word("Good morning", "Ohayo gozaimasu", R.raw.ohayou_goazimasi));
        words.add(new Word("Good night", "Oyasuminasai", R.raw.oyasuminasai));
        words.add(new Word("I'm leaving", "Ittekmasu", R.raw.ittekimasu));
        words.add(new Word("I'm home", "Tadaima", R.raw.tadaima));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_greetings);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
