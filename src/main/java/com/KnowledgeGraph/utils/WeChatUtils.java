package com.KnowledgeGraph.utils;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.KnowledgeGraph.beans.WeChatApiBean;
import com.KnowledgeGraph.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class WeChatUtils {

    @Autowired
    WeChatApiBean weChatApiBean;

/**
 * 微信登陆，通过code获取session_key、openid。
 *     session_key：用于解密 前端wx.getUserProfile(以前是wx.getUserInfo)接口 返回的加密的用户数据，头像、昵称、性别、地区等信息（2022-11，微信已弃用该接口，已无法通过其获取用户信息）。
 *     openid：用户的身份标识，每个用户在每个公众号或者小程序中都有一个唯一openid，跨公众号/小程序时openid不相同。若想在公众号、小程序、开放平台等地方使用不同账号，则使用openid作为用户标识。
 *
 * @param code 通过wx.login获取到的用户的code（登录凭证）
 * @return 返回session_key、openid、isSuccess，通过isSuccess是否为true来判断是否成功获取到session_key、openid。
 *         示例：{"session_key":"VtyIGnq9U2E8c95XUm2SeQ==","openid":"o60_YvksCvHRpajcmiLVAUYybXcM","isSuccess":"false"}
 */
    public String getSessionKeyByWX(String code) {
        String baseUrl = "https://api.weixin.qq.com/sns/jscode2session" + "?appid=" + weChatApiBean.getAppId() + "&secret=" + weChatApiBean.getAppSecret() + "&js_code=" + code + "&grant_type=authorization_code";
        String result = HttpUtil.get(baseUrl);
        return result;
    }

}
