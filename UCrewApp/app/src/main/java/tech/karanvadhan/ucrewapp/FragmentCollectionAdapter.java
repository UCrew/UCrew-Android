package tech.karanvadhan.ucrewapp;

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
                return events.newInstance();//return fragment events
            case 1:
                return dashboard.newInstance();
            case 2:
                return classes.newInstance();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return 3;
    }
}
