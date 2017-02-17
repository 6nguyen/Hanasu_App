package com.example.android.hanasu;

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

        words.add(new Word("Hello", "Konichiwa",R.raw.konichiwa));
        words.add(new Word("Goodbye", "Sayonara",R.raw.sayonara));
        words.add(new Word("Good morning", "Ohayo gozaimasu",R.raw.ohayou_goazimasi));
        words.add(new Word("Good night", "Oyasuminasai",R.raw.oyasuminasai));
        words.add(new Word("I'm leaving", "Ittekmasu",R.raw.ittekimasu));
        words.add(new Word("I'm home", "Tadaima",R.raw.tadaima));

        words.add(new Word("How are you?", "Ogenki desu ka",R.raw.ogenki_desu_ka));
        words.add(new Word("How was it?", "Dou datta ka",R.raw.dou_datta_ka));
        words.add(new Word("Good luck!", "Ganbatte kudasai!",R.raw.ganbatte_kudasai));
        words.add(new Word("Please wait a moment", "Chotto matte kudosai",R.raw.chotto_matte_kudosai));
        words.add(new Word("No good", "Dame desu",R.raw.dame_desu));
        words.add(new Word("How much is it?", "Ikura desu ka?",R.raw.ikura_desu_ka));
        words.add(new Word("Where is the toilet?", "Toire wa doko desu ka?",R.raw.toire_wa_doko_desu_ka));
        words.add(new Word("Thank you for the meal", "Gochisou sama",R.raw.gochisousama));
        words.add(new Word("Let's eat!", "Itadakimasu!",R.raw.itadakimasu));

        words.add(new Word("Thank you", "Doumo arigato gozaimasu!",R.raw.doumo_arigato_gozaimasu));
        words.add(new Word("You're welcome", "Dou itashimashite",R.raw.dou_itashimashite));
        words.add(new Word("Sorry", "Gomennasai",R.raw.gomennasai));
        words.add(new Word("Go Ahead", "Dozo",R.raw.dozo));
        words.add(new Word("Excuse me", "Sumimasen",R.raw.sumimasen));

        words.add(new Word("When?", "Itsu?",R.raw.itsu));
        words.add(new Word("Where?", "Doko?",R.raw.doko));
        words.add(new Word("Who?", "Dare?",R.raw.dare));

        words.add(new Word("I don't understand", "Wakarimasen",R.raw.wakarimasen));
        words.add(new Word("Do you understand?", "Wakarimasu ka?",R.raw.wakarimasu_ka));
        words.add(new Word("I understand", "Wakarimasu",R.raw.wakarimasu));
        words.add(new Word("Please say it one more time", "Mou ichido itte kudasai",R.raw.mou_ichido_itte));
        words.add(new Word("Please speak slowly", "Yukkuri hanashite kudasai",R.raw.yukkuri_hanashite_kudasai));






        // Adding a WordAdapter list of word pairs with dividers
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
