package com.gnguyen.android.hanasu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "aka", R.mipmap.color_red,R.raw.color_aka));
        words.add(new Word("green", "midori", R.mipmap.color_green,R.raw.color_midori));
        words.add(new Word("blue", "ao", R.mipmap.color_blue,R.raw.color_ao));
        words.add(new Word("pink", "momo iro", R.mipmap.color_pink,R.raw.color_momo_iro));
        words.add(new Word("yellow", "kiro", R.mipmap.color_yellow,R.raw.color_kiro));
        words.add(new Word("grey", "ha iro", R.drawable.color_gray,R.raw.color_hairo));
        words.add(new Word("black", "kuro", R.drawable.color_black,R.raw.color_kuro));
        words.add(new Word("white", "shiro", R.drawable.color_white,R.raw.color_shiro));
        words.add(new Word("brown", "cha iro", R.drawable.color_brown,R.raw.color_chairo));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}