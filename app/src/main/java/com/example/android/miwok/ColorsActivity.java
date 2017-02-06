package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "aka", R.drawable.color_red));
        words.add(new Word("green", "midori iro", R.drawable.color_green));
        words.add(new Word("brown", "cha iro", R.drawable.color_brown));
        words.add(new Word("grey", "nezumi iro", R.drawable.color_gray));
        words.add(new Word("black", "kuro", R.drawable.color_black));
        words.add(new Word("white", "shiro", R.drawable.color_white));
        words.add(new Word("beige", "be-ju", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "oudo iro", R.drawable.color_mustard_yellow));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}