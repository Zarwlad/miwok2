package com.example.miwok;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Word {
    @NonNull
    private String defaultTranslation;

    @NonNull
    private String miwokWord;

    private int imgLink;

    private int audioLink;

    public static final int NO_IMAGE_PROVIDED = -1;

    public Word(@NonNull String defaultTranslation, @NonNull String miwokWord, int audioLink) {
        this.defaultTranslation = defaultTranslation;
        this.miwokWord = miwokWord;
        this.audioLink = audioLink;
        this.imgLink = NO_IMAGE_PROVIDED;
    }
}
