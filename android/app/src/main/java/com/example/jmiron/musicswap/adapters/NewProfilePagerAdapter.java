package com.example.jmiron.musicswap.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import com.example.jmiron.musicswap.fragments.NewProfileArtistsFragment;
import com.example.jmiron.musicswap.fragments.NewProfileSaveFragment;
import com.example.jmiron.musicswap.fragments.NewProfileUsernameFragment;
import com.example.jmiron.musicswap.fragments.MainFragment;

/**
 * Created by jmiron on 7/8/2015.
 */
public class NewProfilePagerAdapter extends FragmentStatePagerAdapter {

    public NewProfilePagerAdapter(FragmentManager fm){
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new NewProfileUsernameFragment();
            case 1:
                return new NewProfileArtistsFragment();
            case 2:
                return new NewProfileSaveFragment();
            default:
                return new MainFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}