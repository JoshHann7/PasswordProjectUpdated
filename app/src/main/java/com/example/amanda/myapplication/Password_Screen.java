package com.example.amanda.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Password_Screen extends AppCompatActivity
{
    String passcode = "";
    public static final String EXTRA_TEXT = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password_screen);

        Button buttonEnter = (Button) findViewById(R.id.buttonEnter);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                passcode = passcode + "1";
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                passcode = passcode + "2";
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                passcode = passcode + "3";
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                passcode = passcode + "4";
            }
        });

        buttonEnter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Password_Screen.this, MainActivity.class);
                intent.putExtra(EXTRA_TEXT, passcode);
                intent.putExtra(EXTRA_TEXT, passcode);
                startActivity(intent);
            }
        });
    }
}