package com.example.android.miwok;

/**
 * Created by gnguy on 2/1/2017.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;

// Constructor
    public Word(String eng, String miwok){
        String englishWord = eng;
        String miwokWOrd = miwok;
    }

// Accessor Methods
    public String getEnglish(){
        return mEnglishWord;
    }

    public String getMiwok(){
        return mMiwokWord;
    }
}
