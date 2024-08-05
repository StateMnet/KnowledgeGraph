package com.KnowledgeGraph.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


public class WeChatApiBean {

    private static final String APP_ID="wx19fe8584e1aba10c";
    private static final String APP_SECRET="d75410e2c89c59e95194576fbe9a6a73";

    private String appId;
    private String appSecret;


    public WeChatApiBean() {
        this.appId=APP_ID;
        this.appSecret=APP_SECRET;

    }



    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }



    @Override
    public String toString() {
        return "WeChatApiBean{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
