package com.ua.shidah.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        SeekBar barVolume = (SeekBar)findViewById(R.id.seekBarVolume);
        SeekBar barEffect = (SeekBar)findViewById(R.id.seekBarEffect);

        barVolume.setProgress(MainActivity.backgroundSound.getVolume());
        barEffect.setProgress(MainActivity.backgroundSound.getVolume());

        barVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                MainActivity.backgroundSound.setVolume(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barEffect.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                MainActivity.backgroundSound.setVolume(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }



}
