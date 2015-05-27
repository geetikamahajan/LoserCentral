package com.example.geetikamahajan.lnf11;

/**
 * Created by Geetika Mahajan on 4/22/2015.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        Bundle bundle = new Bundle();
        String tab = "";
        int colorResId = 0;
        switch (index) {
            case 0:
                tab = "lost";
                LostFrag frag = new LostFrag();
                frag.setArguments(bundle);
                return frag;
            case 1:
                tab = "foundsomething";
                FoundSomething fragg = new FoundSomething();
                fragg.setArguments(bundle);
                return fragg;
        }
        bundle.putString("tab",tab);
        bundle.putInt("color", colorResId);
        LostFrag frag = new LostFrag();
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }
}

