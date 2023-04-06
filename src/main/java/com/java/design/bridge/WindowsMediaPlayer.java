package com.java.design.bridge;

/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/6/2023
 */
public class WindowsMediaPlayer extends MediaPlayer {
    public WindowsMediaPlayer(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void play() {
        System.out.println("Playing on " + operatingSystem.getName() + " using WindowsMediaPlayer.");
    }
}
