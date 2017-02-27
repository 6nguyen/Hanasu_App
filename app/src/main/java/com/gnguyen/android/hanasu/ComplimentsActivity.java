package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/22/2017.
 */

public class ComplimentsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Compliments  */
        words.add(new Word("You look amazing!", "Subarashi!", R.raw.phrases_subarashi));
        words.add(new Word("You are so cute", "Anata wa hontoni kawai desu", R.raw.phrase_kawaii));
        words.add(new Word("You are really pretty", "Anata wa tottemo kirei desu", R.raw.phrase_kirei));
        words.add(new Word("You are really nice", "Anata wa tottemo suteki desu", R.raw.phrase_nice));
        words.add(new Word("You're very handsome", "Anata wa tottemo kakkoi yo", R.raw.phrase_kakkoi_yo));
        words.add(new Word("You have beautiful eyes", "Anata wa utsukushī me o motte imasu", R.raw.phrase_utsukushi_me_o));
        words.add(new Word("You're so funny", "Anata wa omoshiroi", R.raw.phrase_omoshiroi));
        words.add(new Word("What are you doing tonight?", "Kon'ya anata wa nani o shite imasu ka?", R.raw.phrase_kon_ya_anata));
        words.add(new Word("Let's go somewhere fun", "Doko ka tanoshiku ikou", R.raw.phrase_tanoshiku_ikou));
        words.add(new Word("Let's get drinks", "Nomimashou", R.raw.phrase_nomimashou));
        words.add(new Word("Let's go to my house", "Watashi noie ni ikou", R.raw.phrase_noei_ni));
        //words.add(new Word("english", "japanese", R.raw.phrase_));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_compliments);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}
