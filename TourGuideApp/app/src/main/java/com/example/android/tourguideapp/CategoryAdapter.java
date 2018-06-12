package com.example.android.tourguideapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DebrecenFragment();
            case 1:
                return new GyorFragment();
            case 2:
                return new VeszpremFragment();
            default:
                return new BudapestFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Drawable drawable;
        if (position == 0) {
            return mContext.getString(R.string.debrecen);
        } else if (position == 1) {
            return mContext.getString(R.string.gyor);
        } else if (position == 2) {
            return mContext.getString(R.string.veszprem);
        } else {
            return mContext.getString(R.string.budapest);
        }
    }
}
