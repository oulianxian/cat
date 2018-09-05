package com.kukuou.cat.controller;

import com.kukuou.cat.common.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * $introduce
 *
 * @author olx
 * @date 2018/9/4/004
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String hello (ModelMap modelMap){
        modelMap.put("url", "www.baidu.com");
        modelMap.addAttribute("url1", "www.baidu.com");
        return "start";
    }

    @ResponseBody
    @RequestMapping("/getIsPat")
    public String getIsPat (){
        return "梓豪";
    }
    @ResponseBody
    @RequestMapping("/testError")
    public String responseError (){
        throw new BusinessException("101", "测试错误");
    }

}
