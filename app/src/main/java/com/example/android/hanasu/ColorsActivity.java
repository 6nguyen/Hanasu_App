package com.example.android.hanasu;

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

        words.add(new Word("red", "aka", R.mipmap.color_red));
        words.add(new Word("green", "midori iro", R.mipmap.color_green));
        words.add(new Word("pink", "pinku", R.mipmap.color_pink));
        words.add(new Word("yellow", "oudo iro", R.mipmap.color_yellow));
        words.add(new Word("blue", "ao", R.mipmap.color_blue));
        words.add(new Word("grey", "nezumi iro", R.drawable.color_gray));
        words.add(new Word("black", "kuro", R.drawable.color_black));
        words.add(new Word("white", "shiro", R.drawable.color_white));
        words.add(new Word("beige", "be-ju", R.drawable.color_dusty_yellow));
        words.add(new Word("brown", "cha iro", R.drawable.color_brown));




        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}