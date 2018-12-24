package tech.karanvadhan.ucrewapp;

import android.provider.ContactsContract;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mainmenu extends AppCompatActivity
{
    private ViewPager viewPager;
    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        viewPager = findViewById(R.id.pager1);
        adapterViewPager = new FragmentCollectionAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setCurrentItem(1); //what fragment starts at mainmenu.


        //starting transaction for moving between fragments between buttons
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        //adding fragments to countainer or dashboard in our case
        fragmentTransaction.add(R.id.fragment_container,new dashboard());
        fragmentTransaction.commit();


    }
}
