package com.ua.shidah.myapplication;

/**
 * Created by Kodak on 2017-11-25.
 */

public class Volume {
    public int getSoundEffect() {
        return soundEffect;
    }

    public void setSoundEffect(int soundEffect) {
        this.soundEffect = soundEffect;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
        MainActivity.backgroundSound.setVolume(soundVolume);
    }

    private int soundEffect;
    private int soundVolume;

    Volume(){
        setSoundEffect(50);
        setSoundVolume(50);
    }

}
