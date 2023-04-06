package com.java.design.bridge;

/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/6/2023
 */
public class LinuxMediaPlayer extends MediaPlayer {
    public LinuxMediaPlayer(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void play() {
        System.out.println("Playing on " + operatingSystem.getName() + " using LinuxMediaPlayer.");
    }
}
