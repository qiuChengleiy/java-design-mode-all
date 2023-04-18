package com.java.design.responsibility;

/**
 * @Author qcl
 * @Description
 * @Date 9:41 AM 4/18/2023
 */
public class Request {
    private String requestInfo;
    private String responseInfo;

    public Request(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setResponseInfo(String responseInfo) {
        this.responseInfo = responseInfo;
    }

    public String getResponseInfo() {
        return responseInfo;
    }
}
