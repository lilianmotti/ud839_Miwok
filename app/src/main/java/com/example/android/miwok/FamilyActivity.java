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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //ArrayList<String> words = new ArrayList<String>();
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "wetetti", R.drawable.family_father));
        words.add(new Word("mother", "chokokki", R.drawable.family_mother));
        words.add(new Word("daughter", "takaakki", R.drawable.family_daughter));
        words.add(new Word("son", "topoppi", R.drawable.family_son));
        words.add(new Word("grandfather", "kululli", R.drawable.family_grandfather));
        words.add(new Word("grandmother", "kelelli", R.drawable.family_grandmother));

        // moving from ArrayAdapter to new customized class WordAdapter
        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>() (this, R.layout.list_item, words)
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
