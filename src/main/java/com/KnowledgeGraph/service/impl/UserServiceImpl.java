package com.KnowledgeGraph.service.impl;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.KnowledgeGraph.common.R;
import com.KnowledgeGraph.service.UserService;
import com.KnowledgeGraph.utils.WeChatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    WeChatUtils weChatUtils;

    @Override
    public R code(String code) {
        String result = weChatUtils.getSessionKeyByWX(code);
        JSONObject jsonObject = JSONUtil.parseObj(result);
        System.err.println("UserServiceImpl-jsonObject:"+jsonObject);
        JSONObject entries = new JSONObject();
        if (jsonObject.get("errcode").equals("0"))
        {
            entries.put("isSuccess", true);
            entries.put("session_key", jsonObject.get("session_key"));
            entries.put("openid", jsonObject.get("openid"));
            return R.success(entries);
        }else {
            entries.put("isSuccess", false);
            return R.success(entries);
        }
    }
}
