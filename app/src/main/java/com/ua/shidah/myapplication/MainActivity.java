package com.ua.shidah.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    public class BackgroundSound extends AsyncTask<Void, Void, Void> {

        private MediaPlayer player;

        static final private float MAX_VOLUME = 100;
        private int volume;

        int getVolume() { return volume; }

        void setVolume(int a) {
            volume = a;
            player.setVolume(volume/MAX_VOLUME,volume/MAX_VOLUME);
        }

        BackgroundSound() {
            player = MediaPlayer.create(MainActivity.this, R.raw.a);
            volume = 50;
        }

        @Override
        protected Void doInBackground(Void... params) {
            player.setLooping(true); // Set looping
            setVolume(volume);
            player.start();
            return null;
        }
    }

    static public BackgroundSound backgroundSound ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundSound = new BackgroundSound();
        backgroundSound.execute();

        Button settingsButton = (Button)findViewById(R.id.setting_button);
        settingsButton.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

    }


}
