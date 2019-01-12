    package com.tablayoutdemowithviewpager.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tablayoutdemowithviewpager.Fragment.FirstFragment;
import com.tablayoutdemowithviewpager.Fragment.SecondFragment;
import com.tablayoutdemowithviewpager.Fragment.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTab;

    public PagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.mNoOfTab = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstFragment tab1 = new FirstFragment();
                return tab1;

            case 1:
                SecondFragment tab2 = new SecondFragment();
                return tab2;

            case 2:
                ThirdFragment tab3 = new ThirdFragment();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return mNoOfTab;
    }
}
