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

        words.add(new Word("Hello", "Konichiwa"));
        words.add(new Word("Goodbye", "Sayonara"));
        words.add(new Word("Good morning", "Ohayo gozaimasu"));
        words.add(new Word("Good night", "Oyasuminasai"));
        words.add(new Word("How are you?", "Ogenki desu ka"));
        words.add(new Word("Thank you", "Waza waza honto ni arigato gozaimasu!"));
        words.add(new Word("Please?", "Dozo"));
        words.add(new Word("You're welcome", "Do itashimashite"));
        words.add(new Word("Excuse me", "Sumimasen"));
        words.add(new Word("When?", "Itsu?"));
        words.add(new Word("Where?", "Doko?"));
        words.add(new Word("Who?", "Dare?"));
        words.add(new Word("I don't understand", "Wakarimasen"));
        words.add(new Word("How much is it?", "Ikura desu ka?"));
        words.add(new Word("Where is the toilet?", "Toire wa doko desu ka?"));

        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
