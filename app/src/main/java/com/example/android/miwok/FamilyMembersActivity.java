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

        words.add(new Word("father","Otoo-san"));
        words.add(new Word("mother","Okaa-san"));
        words.add(new Word("son","musuko"));
        words.add(new Word("daughter","musume"));
        words.add(new Word("older brother","Onii-san"));
        words.add(new Word("younger brother","Otouto"));
        words.add(new Word("older sister","Onee-san"));
        words.add(new Word("younger sister","Imouto"));
        words.add(new Word("grandmother","Obaa-san"));
        words.add(new Word("grandfather","Ojii-san"));
        words.add(new Word("aunt","Oba-san"));
        words.add(new Word("uncle","Oji-san"));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
