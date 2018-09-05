package com.kukuou.cat.controller;

import com.kukuou.cat.common.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author olx
 * @date 2018/9/5/005
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserServcie userServcie;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("usrList", userServcie.listUser());
       return "user";
    }

    @RequestMapping("/addUser")

    public void addUser(String name, Integer age) {
        userServcie.addUser(name, age);

    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public Integer deleteUser(Long id) {
        return userServcie.deleteUser(id);
    }


    @RequestMapping("/updateUser")
    public void updateUser(Long id, String name, Integer age) {
        userServcie.updateUser(id, name, age);
    }
}
