package com.java.design.proxy;

/**
 * @Author qcl
 * @Description
 * @Date 10:16 AM 4/17/2023
 */
public class NetworkVideo implements Video {
    private String url;

    public NetworkVideo(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Playing network video: " + url);
    }
}
