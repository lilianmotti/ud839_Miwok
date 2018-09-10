package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // resource id for background color
    private  int mColorResId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResId){
        super(context,0, words);
        mColorResId = colorResId;
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

        ImageView defaultIcon = (ImageView) listItens.findViewById(R.id.icon_img_view);

        if(currentWord.hasImage()){
            defaultIcon.setImageResource(currentWord.getImageResId());
            defaultIcon.setVisibility(View.VISIBLE);
        } else {
            defaultIcon.setVisibility(View.GONE);
        }

        View textContainer = listItens.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResId);
        //int color = Context.getColor(mColorResId);
        textContainer.setBackgroundColor(color);

        return listItens;
       //return super.getView(position, convertView, parent);
    }
}
