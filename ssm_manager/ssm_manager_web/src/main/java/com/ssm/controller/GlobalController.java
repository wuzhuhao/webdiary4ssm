package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/9 18:28
 */
@Controller
public class GlobalController {
    @RequestMapping("/login")
    public String loginForward(){
        return "login";
    }
}
