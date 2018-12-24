package tech.karanvadhan.ucrewapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class dashboard extends Fragment implements OnClickListener
{
    //trying to create a button in a fragment
    View dashboardView;
    private ImageButton profilevar;
    private ImageButton eventsvar;
    private ImageButton classesvar;
    private ImageButton messagesvar;


    public static dashboard newInstance()
    {
        dashboard fragment = new dashboard();
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater,container,savedInstanceState);
        dashboardView = inflater.inflate(R.layout.fragment_dashboard,container,false);

        //links the Button Variable to buttons on dashboard xml
        profilevar = (ImageButton) dashboardView.findViewById(R.id.profileButton);
        eventsvar = (ImageButton) dashboardView.findViewById(R.id.eventsButton);
        classesvar = (ImageButton) dashboardView.findViewById(R.id.classesButton);
        messagesvar = (ImageButton) dashboardView.findViewById(R.id.messagesButton);

        //when you click these buttons it will call the onClick method.
        profilevar.setOnClickListener(this);
        eventsvar.setOnClickListener(this);
        classesvar.setOnClickListener(this);
        messagesvar.setOnClickListener(this);

        return dashboardView;
    }

    @Override
    public void onClick(View v)
    {
        if(v == profilevar)
        {
            Log.d("xd","please help idk why this isnt working");
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, new profile());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        if(v == eventsvar)
        {

        }
        if(v == messagesvar)
        {

        }
        if(v == classesvar)
        {

        }
    }
}
