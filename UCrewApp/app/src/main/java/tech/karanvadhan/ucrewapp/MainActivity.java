package tech.karanvadhan.ucrewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button registerButton;
    private Button signinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //links the Button Variable to registerButton on xml
        registerButton = (Button) findViewById(R.id.registerButton);
        signinButton = (Button) findViewById(R.id.signinButton);

        //when you click on the registerbutton it will call the method.
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openregister();
            }
        });
        signinButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                opensignIn();
            }
        });
    }
    public void openregister()
    {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
    public void opensignIn()
    {
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
    }
}
