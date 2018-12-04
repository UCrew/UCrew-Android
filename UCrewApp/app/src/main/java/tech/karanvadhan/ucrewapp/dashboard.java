package tech.karanvadhan.ucrewapp;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class dashboard extends Fragment
{

    private ImageButton profilevar;
    public static dashboard newInstance()
    {
        dashboard fragment = new dashboard();
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_dashboard,container,false);
        return view;

        profilevar = (ImageButton) findViewById(R.id.profileTemp);
    }

}
