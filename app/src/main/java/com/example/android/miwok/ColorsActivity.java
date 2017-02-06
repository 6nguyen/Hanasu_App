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

        words.add(new Word("red", "aka", R.mipmap.ic_launcher));
        words.add(new Word("green", "midori iro", R.mipmap.ic_launcher));
        words.add(new Word("brown", "cha iro", R.mipmap.ic_launcher));
        words.add(new Word("grey", "nezumi iro", R.mipmap.ic_launcher));
        words.add(new Word("black", "kuro", R.mipmap.ic_launcher));
        words.add(new Word("white", "shiro", R.mipmap.ic_launcher));
        words.add(new Word("beige", "be-ju", R.mipmap.ic_launcher));
        words.add(new Word("mustard yellow", "oudo iro", R.mipmap.ic_launcher));



        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}