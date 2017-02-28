package com.gnguyen.android.hanasu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gnguy on 2/27/2017.
 */

public class fragmentQuestions extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        /** Questions */
        words.add(new Word("When is it?", "Itsu?", R.raw.itsu));
        words.add(new Word("Where is that?", "Sore wa doko desu ka?", R.raw.phrases_sore_wa_doko_desu_ka));
        words.add(new Word("Who is that?", "Are wa dare?", R.raw.phrases_are_wa_dare));
        words.add(new Word("Where is the toilet?", "Toire wa doko desu ka?", R.raw.toire_wa_doko_desu_ka));
        words.add(new Word("Do you speak English?", "Eigo o hanasemasu ka?", R.raw.phrases_speak_english));
        words.add(new Word("How much is it?", "Ikura desu ka?", R.raw.ikura_desu_ka));
        words.add(new Word("Do you understand?", "Wakarimasu ka?", R.raw.wakarimasu_ka));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_questions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

