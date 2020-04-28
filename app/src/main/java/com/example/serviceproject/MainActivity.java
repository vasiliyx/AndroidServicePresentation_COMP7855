package com.example.serviceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button startButton, stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.buttonStart);
        stopButton = (Button) findViewById(R.id.buttonStop);

        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);

    }

    //@Override
    public void onClick(View v)
    {
        if (v == startButton)
        {
            startService(new Intent( this, AndroidServiceVB.class));
        }

        else if (v == stopButton)
        {
            stopService(new Intent(this, AndroidServiceVB.class));
        }

    }
}
