package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","ichi"));
        words.add(new Word("two","ni"));
        words.add(new Word("three","san"));
        words.add(new Word("four","shi/yon"));
        words.add(new Word("five","go"));
        words.add(new Word("six","roku"));
        words.add(new Word("seven","schichi/nana"));
        words.add(new Word("eight","hachi"));
        words.add(new Word("nine","kyu"));
        words.add(new Word("ten","ju"));
        words.add(new Word("eleven","ju ichi"));
        words.add(new Word("twelve","ju ni"));
        words.add(new Word("thirteen","ju san"));
        words.add(new Word("fourteen","ju yon"));
        words.add(new Word("fifteen","ju go"));
        words.add(new Word("twenty","ni-ju"));
        words.add(new Word("thirty","san-ju"));
        words.add(new Word("forty","yon-ju"));
        words.add(new Word("one hundred","hyaku"));
        words.add(new Word("two hundred","nihyaku"));
        words.add(new Word("three hundred","sanbyaku"));

    // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
