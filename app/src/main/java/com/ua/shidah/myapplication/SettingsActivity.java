package com.ua.shidah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class SettingsActivity extends AppCompatActivity {

//    private int volume, effect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

//        Intent intent = getIntent();
//        volume = intent.getIntExtra("volume", 50);
//        effect = intent.getIntExtra("effect", 50);

        SeekBar barVolume = (SeekBar)findViewById(R.id.seekBarVolume);
        SeekBar barEffect = (SeekBar)findViewById(R.id.seekBarEffect);

        barVolume.setMax(100);
        barVolume.setProgress(MainActivity.volume.getSoundVolume());
        barEffect.setMax(100);
        barEffect.setProgress(MainActivity.volume.getSoundEffect());


        barVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                MainActivity.volume.setSoundVolume(i);
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
                MainActivity.volume.setSoundEffect(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
//
//    @Override
//    public void onBackPressed(){
//        Intent intent = new Intent();
//        intent.putExtra("volume", volume);
//        intent.putExtra("effect", effect);
//        setResult(RESULT_OK, intent);
//        super.onBackPressed();
//        finish();
//    }


}
