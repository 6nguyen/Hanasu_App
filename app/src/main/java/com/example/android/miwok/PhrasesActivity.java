package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Hello", "Konichiwa",R.raw.song));
        words.add(new Word("Goodbye", "Sayonara",R.raw.song));
        words.add(new Word("Good morning", "Ohayo gozaimasu",R.raw.song));
        words.add(new Word("Good night", "Oyasuminasai",R.raw.song));
        words.add(new Word("How are you?", "Ogenki desu ka",R.raw.song));
        words.add(new Word("Thank you", "Waza waza honto ni arigato gozaimasu!",R.raw.song));
        words.add(new Word("Please?", "Dozo",R.raw.song));
        words.add(new Word("You're welcome", "Do itashimashite",R.raw.song));
        words.add(new Word("Excuse me", "Sumimasen",R.raw.song));
        words.add(new Word("When?", "Itsu?",R.raw.song));
        words.add(new Word("Where?", "Doko?",R.raw.song));
        words.add(new Word("Who?", "Dare?",R.raw.song));
        words.add(new Word("I don't understand", "Wakarimasen",R.raw.song));
        words.add(new Word("How much is it?", "Ikura desu ka?",R.raw.song));
        words.add(new Word("Where is the toilet?", "Toire wa doko desu ka?",R.raw.song));

        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
