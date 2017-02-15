package com.example.android.hanasu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","ichi", R.mipmap.number_1,R.raw.song));
        words.add(new Word("two","ni", R.mipmap.number_2,R.raw.song));
        words.add(new Word("three","san", R.mipmap.number_3,R.raw.song));
        words.add(new Word("four","shi/yon", R.mipmap.number_4,R.raw.song));
        words.add(new Word("five","go", R.mipmap.number_5,R.raw.song));
        words.add(new Word("six","roku", R.mipmap.number_6,R.raw.song));
        words.add(new Word("seven","schichi/nana", R.mipmap.number_7,R.raw.song));
        words.add(new Word("eight","hachi", R.mipmap.number_8,R.raw.song));
        words.add(new Word("nine","kyu", R.mipmap.number_9,R.raw.song));
        words.add(new Word("ten","ju", R.mipmap.number_10,R.raw.song));
        //words.add(new Word("eleven","ju ichi", R.mipmap.ic_launcher));
        //words.add(new Word("twelve","ju ni", R.mipmap.ic_launcher));
        //words.add(new Word("thirteen","ju san", R.mipmap.ic_launcher));
        //words.add(new Word("fourteen","ju yon", R.mipmap.ic_launcher));
        //words.add(new Word("fifteen","ju go", R.mipmap.ic_launcher));
        words.add(new Word("twenty","ni-ju", R.mipmap.number_20,R.raw.song));
        words.add(new Word("thirty","san-ju", R.mipmap.number_30,R.raw.song));
        words.add(new Word("forty","yon-ju", R.mipmap.number_40,R.raw.song));
        words.add(new Word("one hundred","hyaku", R.mipmap.number_100,R.raw.song));
        //words.add(new Word("two hundred","nihyaku", R.mipmap.ic_launcher));
        //words.add(new Word("three hundred","sanbyaku", R.mipmap.ic_launcher));

    // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
