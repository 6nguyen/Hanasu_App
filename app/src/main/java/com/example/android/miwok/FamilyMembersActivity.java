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

        words.add(new Word("father","Otoo-san", R.drawable.family_father));
        words.add(new Word("mother","Okaa-san", R.drawable.family_mother));
        words.add(new Word("son","musuko", R.drawable.family_son));
        words.add(new Word("daughter","musume", R.drawable.family_daughter));
        words.add(new Word("older brother","Onii-san", R.drawable.family_older_brother));
        words.add(new Word("younger brother","Otouto", R.drawable.family_younger_brother));
        words.add(new Word("older sister","Onee-san", R.drawable.family_older_sister));
        words.add(new Word("younger sister","Imouto", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","Obaa-san", R.drawable.family_grandmother));
        words.add(new Word("grandfather","Ojii-san", R.drawable.family_grandfather));
        words.add(new Word("aunt","Oba-san", R.drawable.family_mother));
        words.add(new Word("uncle","Oji-san", R.drawable.family_father));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
