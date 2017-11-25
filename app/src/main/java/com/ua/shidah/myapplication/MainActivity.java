package com.ua.shidah.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class BackgroundSound extends AsyncTask<Void, Void, Void> {

        MediaPlayer player;

        public void setVolume(int a) {
            player.setVolume(a,a);
        }

        @Override
        protected Void doInBackground(Void... params) {
            player = MediaPlayer.create(MainActivity.this, R.raw.a);
            player.setLooping(true); // Set looping
            player.setVolume(1.0f, 1.0f);
            player.start();

            return null;
        }
    }

    static public BackgroundSound backgroundSound ;

//    static final int VOLUME_REQUEST = 1;  // The request code

    static public Volume volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volume = new Volume();
        backgroundSound = new BackgroundSound();

        Button settingsButton = (Button)findViewById(R.id.setting_button);
        settingsButton.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View view){
                startSettingsActivity();
            }
        });

    }

    private void startSettingsActivity(){
        Intent intent = new Intent(this, SettingsActivity.class);
//        intent.putExtra("volume", volume.getSoundVolume());
//        intent.putExtra("effect", volume.getSoundEffect());
//        startActivityForResult(intent, VOLUME_REQUEST);
        startActivity(intent);
    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        // Check which request we're responding to
//        if (requestCode == VOLUME_REQUEST) {
//            // Make sure the request was successful
//            if (resultCode == RESULT_OK) {
//                volume.setSoundVolume(data.getIntExtra("volume",50));
//                volume.setSoundEffect(data.getIntExtra("effect",50));
//                Toast.makeText(MainActivity.this, "volume: "+volume.getSoundVolume(), Toast.LENGTH_SHORT).show();
//            }
//        }
//    }

}
