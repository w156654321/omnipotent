package com.liudh.shiro.controller;

import com.liudh.shiro.pojo.UPermission;
import com.liudh.shiro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/25 17:21
 * 创建描述：
 *
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String index(){

        UPermission permission = testService.selectAll();
        System.out.println(permission);

        return "index";
    }
}
