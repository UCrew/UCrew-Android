package tech.karanvadhan.ucrewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.view.GestureDetectorCompat;

public class mainmenu extends AppCompatActivity
{
    private Button buttonLeft;
    private Button buttonRight;
    private Button buttonUp;
    private Button buttonDown;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        //links the Button Variable to Button on xml
        buttonLeft = (Button) findViewById(R.id.buttonLeft);
        buttonRight = (Button) findViewById(R.id.buttonRight);
        buttonUp = (Button) findViewById(R.id.buttonUp);
        buttonDown = (Button) findViewById(R.id.buttonDown);

        //when you click on the buttonLeft it will call the method.
        buttonLeft.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openschool();
            }
        });
        //when you click on the buttonRight it will call the method.
        buttonRight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openevents();
            }
        });
        //when you click on the buttonUp it will call the method.
        buttonUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openmessages();
            }
        });
        //when you click on the buttonUp it will call the method.
        buttonDown.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openprofile();
            }
        });
    }
    public void openschool()
    {
        Intent intent = new Intent(this, school.class);
        startActivity(intent);
    }
    public void openevents()
    {
        Intent intent = new Intent(this, events.class);
        startActivity(intent);
    }
    public void openmessages()
    {
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }
    public void openprofile()
    {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
