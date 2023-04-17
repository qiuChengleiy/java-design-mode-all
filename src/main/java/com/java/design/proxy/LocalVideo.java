package com.java.design.proxy;

/**
 * @Author qcl
 * @Description
 * @Date 10:16 AM 4/17/2023
 */
public class LocalVideo implements Video {
    private String filePath;

    public LocalVideo(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        System.out.println("Playing local video: " + filePath);
    }
}
