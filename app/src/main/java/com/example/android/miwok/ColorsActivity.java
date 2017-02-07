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

        words.add(new Word("red", "aka", R.mipmap.color_red,R.raw.song));
        words.add(new Word("green", "midori iro", R.mipmap.color_green,R.raw.song));
        words.add(new Word("pink", "pinku", R.mipmap.color_pink,R.raw.song));
        words.add(new Word("yellow", "oudo iro", R.mipmap.color_yellow,R.raw.song));
        words.add(new Word("blue", "ao", R.mipmap.color_blue,R.raw.song));
        words.add(new Word("grey", "nezumi iro", R.drawable.color_gray,R.raw.song));
        words.add(new Word("black", "kuro", R.drawable.color_black,R.raw.song));
        words.add(new Word("white", "shiro", R.drawable.color_white,R.raw.song));
        words.add(new Word("beige", "be-ju", R.drawable.color_dusty_yellow,R.raw.song));
        words.add(new Word("brown", "cha iro", R.drawable.color_brown,R.raw.song));




        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}