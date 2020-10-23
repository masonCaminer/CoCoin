package com.nightonke.saver.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.nightonke.saver.fragment.TodayViewFragment;
import com.nightonke.saver.util.CoCoinUtil;

/**
 * Created by 伟平 on 2015/10/20.
 */

public class TodayViewFragmentAdapter extends FragmentStatePagerAdapter {

    private static final int TODAY_VIEW_FRAGMENT_NUMBER = 8;

    public TodayViewFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        return TodayViewFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return TODAY_VIEW_FRAGMENT_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CoCoinUtil.GetTodayViewTitle(position % TODAY_VIEW_FRAGMENT_NUMBER);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
