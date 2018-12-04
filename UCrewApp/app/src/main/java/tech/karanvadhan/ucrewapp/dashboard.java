package tech.karanvadhan.ucrewapp;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class dashboard extends Fragment
{
    View view;
    ImageButton profilevar;
    ImageButton eventsvar;
    ImageButton classesvar;
    ImageButton messagesvar;

    public dashboard()
    {

    }
    public static dashboard newInstance()
    {
        dashboard fragment = new dashboard();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        profilevar = (ImageButton) view.findViewById(R.id.profileTemp);
        profilevar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                profile profileFragment = new profile();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction fragmentTransaction= manager.beginTransaction();
                fragmentTransaction.replace(R.id.profilefrag,profileFragment,profileFragment.getTag())
                        .commit();

            }
        });
        return view;
    }

}