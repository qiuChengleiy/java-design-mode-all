package com.java.design.bridge;

/**
 * @Author qcl
 * @Description
 * @Date 9:40 AM 4/6/2023
 */
public abstract class MediaPlayer {
    protected OperatingSystem operatingSystem;

    public MediaPlayer(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void play();
}

