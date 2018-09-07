package com.example.android.miwok;

public class Word {

    //create instances
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    /**create a Word object with two Strings: English and Miwok
     * constructors have no return type (e.g.no void)
     * @param defaultTranslation English word
     * @param miwokTranslation equivalent in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    //get English
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get Miwok
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
