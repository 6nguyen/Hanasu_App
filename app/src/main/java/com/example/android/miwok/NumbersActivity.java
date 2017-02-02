package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));
        

/*  // Adding a LinearLayout list of words (more memory intensive.  Page loads all words at once
    // Only use when there are a fixed amount of views to load onto the page.
    // Ex: fitbit that tracks pulse, distance walked, and calories burned.

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        for(int i=0; i<words.size(); i++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }
*/
    // Adding a ArrayAdapter list of words with dividers
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
