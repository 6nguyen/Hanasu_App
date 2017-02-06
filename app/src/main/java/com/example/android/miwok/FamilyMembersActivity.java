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

        words.add(new Word("father","Otoo-san", R.mipmap.ic_launcher));
        words.add(new Word("mother","Okaa-san", R.mipmap.ic_launcher));
        words.add(new Word("son","musuko", R.mipmap.ic_launcher));
        words.add(new Word("daughter","musume", R.mipmap.ic_launcher));
        words.add(new Word("older brother","Onii-san", R.mipmap.ic_launcher));
        words.add(new Word("younger brother","Otouto", R.mipmap.ic_launcher));
        words.add(new Word("older sister","Onee-san", R.mipmap.ic_launcher));
        words.add(new Word("younger sister","Imouto", R.mipmap.ic_launcher));
        words.add(new Word("grandmother","Obaa-san", R.mipmap.ic_launcher));
        words.add(new Word("grandfather","Ojii-san", R.mipmap.ic_launcher));
        words.add(new Word("aunt","Oba-san", R.mipmap.ic_launcher));
        words.add(new Word("uncle","Oji-san", R.mipmap.ic_launcher));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
