package com.example.amanda.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Intent intent = getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button theButton = (Button) findViewById(R.id.button);
        theButton.setText("Unlock");

        theButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "Please use pin to unlock app", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Password_Screen.class);
                startActivity(intent);
            }
        });

        Toast.makeText(MainActivity.this, "You entered " + intent.getStringExtra(Password_Screen.EXTRA_TEXT), Toast.LENGTH_LONG).show();

        if(intent.getStringExtra(Password_Screen.EXTRA_TEXT) == "1234")
        {
            TextView z = (TextView) findViewById(R.id.textView2);
            z.setText("Welcome to the app! The app is UNLOCKED!");
            System.out.println(z);
        }
        else
        {
            TextView theTextView = (TextView) findViewById(R.id.textView2);
            theTextView.setText("Welcome to the app! The app is LOCKED!");
            System.out.println(theTextView);
        }
    }
}