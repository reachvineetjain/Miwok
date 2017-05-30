package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Vineet K Jain on 1/6/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

        Context mContext;

        public SimpleFragmentPagerAdapter(Context ctx, FragmentManager fm) {
            super(fm);
            mContext = ctx;
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new NumbersFragment();
            } else if (position == 1){
                return new ColorsFragment();
            } else if (position == 2) {
                return new FamilyFragment();
            } else {
                return new PhrasesFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_colors);
        } else if (position == 2) {
            return mContext.getString(R.string.category_family);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
    }
}
