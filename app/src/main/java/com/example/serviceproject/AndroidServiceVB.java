package com.example.serviceproject;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class AndroidServiceVB extends Service
{

    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {

        player = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        player.setLooping(true);
        player.start();

        return START_STICKY; // Will return the status of this program

        //return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();


        player.stop();

    }
}
