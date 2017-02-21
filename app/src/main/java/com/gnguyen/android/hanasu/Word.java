package com.gnguyen.android.hanasu;


/**
 * Created by gnguy on 2/1/2017.
 */


public class Word {
    private String mEnglishWord;
    private String mJapaneseWord;
    private int mImageResourceId = -1;
    private int mAudioResrouceId;

    /** Constructor with NO image
     *  Create a Word Object instance containing a String's Japanese and English translation
     * @param eng English translation
     * @param jap Japanese translation
     */
    public Word(String eng, String jap, int AudioResrouceId){
        mEnglishWord = eng;
        mJapaneseWord = jap;
        mAudioResrouceId = AudioResrouceId;
    }

    /** Constructor with image
     *  Create a Word Object instance containing a String's Japanese and English translation, and
     *  an image.
     * @param eng English translation
     * @param jap Japanese translation
     * @param imageResourceId Resource ID reference to actual image's location, ie R.drawable.num_1
     */
    public Word(String eng, String jap, int imageResourceId, int AudioResrouceId){
        mEnglishWord = eng;
        mJapaneseWord = jap;
        mImageResourceId = imageResourceId;
        mAudioResrouceId = AudioResrouceId;
    }

    /** Accessor Methods
     *  Get method has no parameters
     * @return English translation, Miwok translation, or image resource ID
     */
    public String getEnglish(){return mEnglishWord;}
    public String getJapanese(){return mJapaneseWord;}
    public int getImageResourceId(){return mImageResourceId;}
    public int getmAudioResrouceId(){return mAudioResrouceId;}

    /**
     * Determines whether Word object instance has an image or not.
     * mImageResourceId is -1 by default, since no real resource ID can be -1.
     * When the constructor is called, any instance with an image resource ID will change this
     * value to its corresponding int ID.
     * @return true if Word object instance has image, otherwise false
     */
    public boolean hasImage(){
        return mImageResourceId != -1;
    }

}
