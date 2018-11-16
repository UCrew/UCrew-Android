package tech.karanvadhan.ucrewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.GestureDetector;

public class mainmenu extends AppCompatActivity implements GestureDetector.OnGestureListener,View.OnTouchListener
{
    private static final String TAG = "MainMenu";

    private Button buttonLeft;
    private Button buttonRight;
    private Button buttonUp;
    private Button buttonDown;
    private GestureDetector detectswipes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        detectswipes = new GestureDetector(this,this);

        //links the Button Variable to Button on xml
        buttonLeft = (Button) findViewById(R.id.buttonLeft);
        buttonRight = (Button) findViewById(R.id.buttonRight);
        buttonUp = (Button) findViewById(R.id.buttonUp);
        buttonDown = (Button) findViewById(R.id.buttonDown);

        buttonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmessages();
            }
        });
        buttonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprofile();
            }
        });
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openschool();
            }
        });
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openevents();
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

    //onTouch Methods

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        Log.d(TAG,"onTouch: Called");
        return true;
    }

    //GestureDetector Methods

    @Override
    public boolean onDown(MotionEvent e)
    {
        Log.d(TAG,"onDown: Called");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e)
    {
        Log.d(TAG,"onShowPress: Called");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e)
    {
        Log.d(TAG,"onSingleTapUp: Called");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d(TAG,"onScroll: Called");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e)
    {
        Log.d(TAG,"onLongPress: Called");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
    {
        Log.d(TAG,"onFling: Called");
        return false;
    }
}
