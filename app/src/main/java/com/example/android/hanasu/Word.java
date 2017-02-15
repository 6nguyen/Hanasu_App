package com.example.android.hanasu;

/**
 * Created by gnguy on 2/1/2017.
 */


public class Word {
    private String mEnglishWord;
    private String mJapaneseWord;
    private int mImageResourceId = -1;

    /** Constructor with NO image
     *  Create a Word Object instance containing a String's Japanese and English translation
     * @param eng English translation
     * @param jap Japanese translation
     */
    public Word(String eng, String jap){
        mEnglishWord = eng;
        mJapaneseWord = jap;
    }

    /** Constructor with image
     *  Create a Word Object instance containing a String's Japanese and English translation, and
     *  an image.
     * @param eng English translation
     * @param jap Japanese translation
     * @param imageResourceId Resource ID reference to actual image's location, ie R.drawable.num_1
     */
    public Word(String eng, String jap, int imageResourceId){
        mEnglishWord = eng;
        mJapaneseWord = jap;
        mImageResourceId = imageResourceId;
    }

    /** Accessor Methods
     *  Get method has no parameters
     * @return English translation, Miwok translation, or image resource ID
     */
    public String getEnglish(){return mEnglishWord;}
    public String getJapanese(){return mJapaneseWord;}
    public int getImageResourceId(){return mImageResourceId;}


    public boolean hasImage(){
        return mImageResourceId != -1;
    }

}
