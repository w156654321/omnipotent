package com.liudh.shiro.controller;

import com.liudh.shiro.pojo.UPermission;
import com.liudh.shiro.service.TestService;
import com.liudh.shiro.util.MdUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

//        UPermission permission = testService.insertTest();
//        System.out.println(permission);

        return "index";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model) throws Exception {

        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        String captcha = request.getParameter("captcha");
        captcha = "1234";
        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd, captcha);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);

        return "index";
    }
}
