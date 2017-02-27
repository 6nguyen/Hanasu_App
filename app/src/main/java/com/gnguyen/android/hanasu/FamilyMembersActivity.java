package com.gnguyen.android.hanasu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;


public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","Otou-san", R.mipmap.father,R.raw.family_otousan));
        words.add(new Word("mother","Okaa-san", R.mipmap.mother,R.raw.family_okaasan));
        words.add(new Word("son","Musuko-san", R.mipmap.son,R.raw.family_musukosan));
        words.add(new Word("daughter","Musume-san", R.mipmap.daughter,R.raw.family_musumesan));
        words.add(new Word("older brother","Onii-san", R.mipmap.son,R.raw.family_oniisan));
        words.add(new Word("younger brother","Otouto-san", R.mipmap.younger_brother,R.raw.family_otoutosan));
        words.add(new Word("older sister","Onee-san", R.mipmap.daughter,R.raw.family_oneesan));
        words.add(new Word("younger sister","Imouto-san", R.mipmap.younger_sister,R.raw.family_imoutosan));
        words.add(new Word("grandmother","Obaa-san", R.mipmap.grandma,R.raw.family_obaasan));
        words.add(new Word("grandfather","Ojii-san", R.mipmap.grandpa,R.raw.family_ojiisan));
        words.add(new Word("aunt","Oba-san", R.mipmap.aunt,R.raw.family_oba));
        words.add(new Word("uncle","Oji-san", R.mipmap.uncle,R.raw.family_oji));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
