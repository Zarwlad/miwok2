package com.example.miwok;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorId;

    public WordAdapter(Activity context, List<Word> words, int color){
        super(context, 0, words);
        mColorId = color;
    }

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.base_layout, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defTextView = listItemView.findViewById(R.id.defWordTextView);
        defTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokWordTextView = listItemView.findViewById(R.id.milWordTextView);
        miwokWordTextView.setText(currentWord.getMiwokWord());

        ImageView imageView = listItemView.findViewById(R.id.wordImageView);

        if (currentWord.getImgLink() != Word.NO_IMAGE_PROVIDED) {
            imageView.setImageResource(currentWord.getImgLink());
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textcontainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textcontainer.setBackgroundColor(color);

        return listItemView;
    }
}
