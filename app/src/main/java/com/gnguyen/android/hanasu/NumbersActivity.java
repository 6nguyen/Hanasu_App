package com.gnguyen.android.hanasu;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        /**
         *  since android:theme AppCompat.Light.DarkActionBar does not support ActionBar,
         *  must use getSupportActionBar() instead of getActionBar()
         */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","ichi", R.mipmap.number_1,R.raw.numbers_ichi));
        words.add(new Word("two","ni", R.mipmap.number_2,R.raw.numbers_ni));
        words.add(new Word("three","san", R.mipmap.number_3,R.raw.numbers_san));
        words.add(new Word("four","shi/yon", R.mipmap.number_4,R.raw.numbers_yon));
        words.add(new Word("five","go", R.mipmap.number_5,R.raw.numbers_go));
        words.add(new Word("six","roku", R.mipmap.number_6,R.raw.numbers_roku));
        words.add(new Word("seven","schichi/nana", R.mipmap.number_7,R.raw.numbers_nana));
        words.add(new Word("eight","hachi", R.mipmap.number_8,R.raw.numbers_hachi));
        words.add(new Word("nine","kyu", R.mipmap.number_9,R.raw.numbers_kyu));
        words.add(new Word("ten","jyu", R.mipmap.number_10,R.raw.numbers_jyu));
        /**
         *  No icons to represent these numbers
        words.add(new Word("eleven","jyu ichi", R.mipmap.ic_launcher3, R.raw.jyu_ichi));
        words.add(new Word("twelve","jyu ni", R.mipmap.ic_launcher3, R.raw.jyu_ni));
        words.add(new Word("thirteen","jyu san", R.mipmap.ic_launcher3, R.raw.jyu_san));
        words.add(new Word("fourteen","jyu yon", R.mipmap.ic_launcher3,R.raw.jyu_yon));
        words.add(new Word("fifteen","jyu go", R.mipmap.ic_launcher3, R.raw.jyu_go));
         */
        words.add(new Word("twenty","ni-jyu", R.mipmap.number_20,R.raw.numbers_ni_jyu));
        words.add(new Word("thirty","san-jyu", R.mipmap.number_30,R.raw.numbers_san_jyu));
        words.add(new Word("forty","yon-jyu", R.mipmap.number_40,R.raw.numbers_yon_jyu));
        words.add(new Word("one hundred","hyaku", R.mipmap.number_100,R.raw.numbers_hyaku));
        //words.add(new Word("two hundred","nihyaku", R.mipmap.ic_launcher));
        //words.add(new Word("three hundred","sanbyaku", R.mipmap.ic_launcher));

    // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
