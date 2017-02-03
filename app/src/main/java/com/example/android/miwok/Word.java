package com.example.android.miwok;

/**
 * Created by gnguy on 2/1/2017.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;

// Constructor
    public Word(String eng, String miwok){
        mEnglishWord = eng;
        mMiwokWord = miwok;
    }

// Accessor Methods
    public String getEnglish(){return mEnglishWord;}
    public String getMiwok(){return mMiwokWord;}
}
