package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/17/2017.
 */

public class ConversationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Conversation */
        words.add(new Word("How are you?", "Ogenki desu ka", R.raw.ogenki_desu_ka));
        words.add(new Word("How was it?", "Dou datta ka", R.raw.dou_datta_ka));
        words.add(new Word("Good luck!", "Ganbatte kudasai!", R.raw.ganbatte_kudasai));
        words.add(new Word("Please wait a moment", "Chotto matte kudosai", R.raw.chotto_matte_kudosai));
        words.add(new Word("No good", "Dame desu", R.raw.dame_desu));
        words.add(new Word("Let's have fun!", "Tanoshimou!", R.raw.phrases_tanashimo));
        words.add(new Word("Thank you for the meal", "Gochisou sama", R.raw.gochisousama));
        words.add(new Word("Let's eat!", "Itadakimasu!", R.raw.itadakimasu));
        words.add(new Word("I don't understand", "Wakarimasen", R.raw.wakarimasen));
        words.add(new Word("I understand", "Wakarimasu", R.raw.wakarimasu));
        words.add(new Word("Please say it one more time", "Mou ichido itte kudasai", R.raw.mou_ichido_itte));
        words.add(new Word("Please speak slowly", "Yukkuri hanashite kudasai", R.raw.yukkuri_hanashite_kudasai));


        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_conversation);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
