package com.example.miwok;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class MiwokPagerAdapter extends FragmentPagerAdapter {

    public MiwokPagerAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new NumbersFragment();
            case 1: return new FamilyMembersFragment();
            case 2: return new ColorsFragment();
            default: return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "numbers";
            case 1: return "family";
            case 2: return "colors";
            default: return "phrases";
        }
    }
}
