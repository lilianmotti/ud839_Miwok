package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words){
        super(context,0, words);
    }

    /**
     * provides a view for a Word
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItens = convertView;
        //is there une existing view that we can use? creates or reuse
        if (listItens==null){
            listItens = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView miwokTV = (TextView) listItens.findViewById(R.id.miwok_text_view);
        miwokTV.setText(currentWord.getmMiwokTranslation());
        TextView defaultTV = (TextView) listItens.findViewById(R.id.default_text_view);
        defaultTV.setText(currentWord.getmDefaultTranslation());

        return listItens;
       //return super.getView(position, convertView, parent);
    }
}
