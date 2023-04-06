package com.java.design.bridge;

/**
 * @Author qcl
 * @Description
 * @Date 9:48 AM 4/6/2023
 */
public class BridgeTest {
    public static void main(String[] args) {
        MediaPlayer player = new MacMediaPlayer(new Mac());
        player.play();

        // Playing on Mac using MacMediaPlayer.
    }
}
