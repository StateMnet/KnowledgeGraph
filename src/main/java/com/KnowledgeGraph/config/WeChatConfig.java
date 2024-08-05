package com.KnowledgeGraph.config;

import com.KnowledgeGraph.beans.WeChatApiBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeChatConfig {

    /**
     * 连接微信API bean
     * @return
     */
    @Bean
    public WeChatApiBean weChatApiBean(){
        return new WeChatApiBean();
    }
}
