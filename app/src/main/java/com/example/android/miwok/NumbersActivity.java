package com.example.android.miwok;

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

        words.add(new Word("one","ichi", R.drawable.number_one));
        words.add(new Word("two","ni", R.drawable.number_two));
        words.add(new Word("three","san", R.drawable.number_three));
        words.add(new Word("four","shi/yon", R.drawable.number_four));
        words.add(new Word("five","go", R.drawable.number_five));
        words.add(new Word("six","roku", R.drawable.number_six));
        words.add(new Word("seven","schichi/nana", R.drawable.number_seven));
        words.add(new Word("eight","hachi", R.drawable.number_eight));
        words.add(new Word("nine","kyu", R.drawable.number_nine));
        words.add(new Word("ten","ju", R.drawable.number_ten));
        words.add(new Word("eleven","ju ichi", R.mipmap.ic_launcher));
        words.add(new Word("twelve","ju ni", R.mipmap.ic_launcher));
        words.add(new Word("thirteen","ju san", R.mipmap.ic_launcher));
        words.add(new Word("fourteen","ju yon", R.mipmap.ic_launcher));
        words.add(new Word("fifteen","ju go", R.mipmap.ic_launcher));
        words.add(new Word("twenty","ni-ju", R.mipmap.ic_launcher));
        words.add(new Word("thirty","san-ju", R.mipmap.ic_launcher));
        words.add(new Word("forty","yon-ju", R.mipmap.ic_launcher));
        words.add(new Word("one hundred","hyaku", R.mipmap.ic_launcher));
        words.add(new Word("two hundred","nihyaku", R.mipmap.ic_launcher));
        words.add(new Word("three hundred","sanbyaku", R.mipmap.ic_launcher));

    // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
