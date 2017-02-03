package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "aka"));
        words.add(new Word("green", "midori iro"));
        words.add(new Word("brown", "cha iro"));
        words.add(new Word("grey", "nezumi iro"));
        words.add(new Word("black", "kuro"));
        words.add(new Word("white", "shiro"));
        words.add(new Word("beige", "be-ju"));
        words.add(new Word("mustard yellow", "oudo iro"));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}