package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;


public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","Otoo-san", R.mipmap.father,R.raw.song));
        words.add(new Word("mother","Okaa-san", R.mipmap.mother,R.raw.song));
        words.add(new Word("son","Musuko", R.mipmap.son,R.raw.song));
        words.add(new Word("daughter","Musume", R.mipmap.daughter,R.raw.song));
        words.add(new Word("older brother","Onii-san", R.mipmap.son,R.raw.song));
        words.add(new Word("younger brother","Otouto", R.mipmap.younger_brother,R.raw.song));
        words.add(new Word("older sister","Onee-san", R.mipmap.daughter,R.raw.song));
        words.add(new Word("younger sister","Imouto", R.mipmap.younger_sister,R.raw.song));
        words.add(new Word("grandmother","Obaa-san", R.mipmap.grandma,R.raw.song));
        words.add(new Word("grandfather","Ojii-san", R.mipmap.grandpa,R.raw.song));
        words.add(new Word("aunt","Oba-san", R.mipmap.aunt,R.raw.song));
        words.add(new Word("uncle","Oji-san", R.mipmap.uncle,R.raw.song));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
