package com.example.android.hanasu;

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

        words.add(new Word("father","Otoo-san", R.mipmap.father));
        words.add(new Word("mother","Okaa-san", R.mipmap.mother));
        words.add(new Word("son","musuko", R.mipmap.son));
        words.add(new Word("daughter","musume", R.mipmap.daughter));
        words.add(new Word("older brother","Onii-san", R.mipmap.son));
        words.add(new Word("younger brother","Otouto", R.mipmap.younger_brother));
        words.add(new Word("older sister","Onee-san", R.mipmap.daughter));
        words.add(new Word("younger sister","Imouto", R.mipmap.younger_sister));
        words.add(new Word("grandmother","Obaa-san", R.mipmap.grandma));
        words.add(new Word("grandfather","Ojii-san", R.mipmap.grandpa));
        words.add(new Word("aunt","Oba-san", R.mipmap.aunt));
        words.add(new Word("uncle","Oji-san", R.mipmap.uncle));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
