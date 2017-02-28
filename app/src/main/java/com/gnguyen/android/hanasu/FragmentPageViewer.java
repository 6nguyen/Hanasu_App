package com.gnguyen.android.hanasu;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;

/**
 * Created by gnguy on 2/27/2017.
 */

public class FragmentPageViewer extends FragmentPagerAdapter {

    final int PAGE_COUNT = 5;
    Context context;
    //private Activity myActivity;
/**
    public FragmentPageViewer(FragmentManager fm, Activity myActivity) {
        super(fm);
        this.myActivity = myActivity;
    }
 */

    public FragmentPageViewer(FragmentManager fm, Context mContext){
        super(fm);
        context = mContext;
    }

    // Fragment swiping order from left to right
    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new fragmentGreetings();
        } else if (position == 1) {
            return new fragmentConversations();
        } else if (position == 2) {
            return new fragmentPoliteness();
        } else if (position == 3) {
            return new fragmentQuestions();
        } else {
            return new fragmentCompliments();
        }
    }

    // Total number of swipable fragments
    @Override
    public int getCount(){
        return PAGE_COUNT;
    }

    // Fragment titles
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return context.getString(R.string.category_greetings);
            case 1:
                return context.getString(R.string.category_conversation);
            case 2:
                return context.getString(R.string.category_politeness);
            case 3:
                return context.getString(R.string.category_questions);
            default:
                return context.getString(R.string.category_compliments);
        }
    }

}
