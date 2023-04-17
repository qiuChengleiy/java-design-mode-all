package com.java.design.proxy;

/**
 * @Author qcl
 * @Description 代理模式
 * @Date 10:16 AM 4/17/2023
 */
public class Client {
    public static void main(String[] args) {
        // 播放本地视频
        Video localVideo = new LocalVideo("sample.mp4");
        localVideo.play();

        // 播放网络视频
        NetworkVideo networkVideo = new NetworkVideo("https://example.com/sample.mp4");
        Video networkVideoProxy = new NetworkVideoProxy(networkVideo);
        networkVideoProxy.play();
    }
}

