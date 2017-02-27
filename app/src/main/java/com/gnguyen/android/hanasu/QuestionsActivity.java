package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/17/2017.
 */

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Questions */
        words.add(new Word("When is it?", "Itsu?", R.raw.itsu));
        words.add(new Word("Where is that?", "Sore wa doko desu ka?", R.raw.phrases_sore_wa_doko_desu_ka));
        words.add(new Word("Who is that?", "Are wa dare?", R.raw.phrases_are_wa_dare));
        words.add(new Word("Where is the toilet?", "Toire wa doko desu ka?", R.raw.toire_wa_doko_desu_ka));
        words.add(new Word("Do you speak English?", "Eigo o hanasemasu ka?", R.raw.phrases_speak_english));
        words.add(new Word("How much is it?", "Ikura desu ka?", R.raw.ikura_desu_ka));
        words.add(new Word("Do you understand?", "Wakarimasu ka?", R.raw.wakarimasu_ka));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_questions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
