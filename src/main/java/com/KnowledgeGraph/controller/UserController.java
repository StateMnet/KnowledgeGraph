package com.KnowledgeGraph.controller;

import com.KnowledgeGraph.beans.WeChatApiBean;
import com.KnowledgeGraph.common.R;
import com.KnowledgeGraph.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("code")
    public R getWeChatApiBean(@RequestParam String code) {
        R result = userService.code(code);
        System.err.println(result);
        return result;
    };
}
