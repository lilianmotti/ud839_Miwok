/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //ArrayList<String> words = new ArrayList<String>();
        ArrayList<Word> words = new ArrayList<Word>();

        //words.get("one");
        //Word w = new Word("one";"lutti");
        //words.add(w);

        words.add(new Word("one","lutti", R.drawable.number_one));
        words.add(new Word("two","otiiko", R.drawable.number_two));
        words.add(new Word("three","tolookasu", R.drawable.number_three));
        words.add(new Word("four","oyyisa", R. drawable.number_four));
        words.add(new Word("five","massoka", R. drawable.number_five));
        words.add(new Word("six","temmokka", R.drawable.number_six));




        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        int i=0;
//        //int sizeOfWords = words.size();
//        //while (i<sizeOfWords){
//        // for (int i; i<words.size(); i++){
//        for (String str:words){
//            //Log.v("NumbersActivity", "Word at index 0: "+i);
//            TextView wordView = new TextView(this);
//            //wordView.setText(words.get(i));
//            wordView.setText(str);
//            rootView.addView(wordView);
//            i++;
//        }

        //using ArrayAdapter with an array of Strings
//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(itemsAdapter);

       // moving from ArrayAdapter to new customized class WordAdapter
        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>() (this, R.layout.list_item, words)
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
