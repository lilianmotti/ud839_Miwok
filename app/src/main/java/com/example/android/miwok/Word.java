package com.example.android.miwok;

public class Word {

    //create instances
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResId;

    /**create a Word object with two Strings: English and Miwok
     * constructors have no return type (e.g.no void)
     * @param defaultTranslation English word
     * @param miwokTranslation equivalent in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    /**create a Word object with two Strings: English and Miwok
     * constructors have no return type (e.g.no void)
     * @param defaultTranslation English word
     * @param miwokTranslation equivalent in Miwok language
     * @param imageResId image resource id
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResId = imageResId;

    }

    //get English
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get Miwok
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    // get image resource id (drawable folder)
    public int getImageResId(){
        return mImageResId;
    }
}
