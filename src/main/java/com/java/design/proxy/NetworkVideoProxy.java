package com.java.design.proxy;

/**
 * @Author qcl
 * @Description
 * @Date 10:16 AM 4/17/2023
 */
public class NetworkVideoProxy implements Video {
    private NetworkVideo networkVideo;

    public NetworkVideoProxy(NetworkVideo networkVideo) {
        this.networkVideo = networkVideo;
    }

    @Override
    public void play() {
        // 模拟权限校验
        boolean hasPermission = checkPermission();

        if (hasPermission) {
            networkVideo.play();
        } else {
            System.out.println("You do not have permission to play this video.");
        }
    }

    private boolean checkPermission() {
        // 模拟权限校验
        return true;
    }
}
