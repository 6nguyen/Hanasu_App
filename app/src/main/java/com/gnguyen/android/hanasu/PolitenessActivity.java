package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/17/2017.
 */

public class PolitenessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Politeness */
        words.add(new Word("Thank you", "Doumo arigato gozaimasu!", R.raw.doumo_arigato_gozaimasu));
        words.add(new Word("You're welcome", "Dou itashimashite", R.raw.dou_itashimashite));
        words.add(new Word("Sorry", "Gomennasai", R.raw.gomennasai));
        words.add(new Word("Go Ahead", "Dozo", R.raw.dozo));
        words.add(new Word("Excuse me", "Sumimasen", R.raw.sumimasen));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_politeness);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
