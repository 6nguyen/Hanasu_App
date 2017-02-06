package com.example.android.miwok;

/**
 * Created by gnguy on 2/1/2017.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;
    private int mImageResourceId;

// Constructor
    public Word(String eng, String miwok, int imageResourceId){
        mEnglishWord = eng;
        mMiwokWord = miwok;
        mImageResourceId = imageResourceId;
    }

// Accessor Methods
    public String getEnglish(){return mEnglishWord;}
    public String getMiwok(){return mMiwokWord;}
    public int getImageResourceId(){return mImageResourceId;}
}
