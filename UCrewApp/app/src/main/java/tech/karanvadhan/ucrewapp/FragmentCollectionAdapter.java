package tech.karanvadhan.ucrewapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentCollectionAdapter extends FragmentPagerAdapter
{

    public FragmentCollectionAdapter(FragmentManager fm)
    {
        super(fm);
    } //no touch

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return dashboard.newInstance();
            case 1:
                return profile.newInstance(); //return fragment profile
            case 2:
                return university.newInstance(); //return fragment university
            case 3:
                return events.newInstance(); //return fragment events
            case 4:
                return messages.newInstance();//return fragment messages
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return 5;
    }
}
