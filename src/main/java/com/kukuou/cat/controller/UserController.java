package com.kukuou.cat.controller;

import com.kukuou.cat.common.exception.BusinessException;
import com.kukuou.cat.entity.User;
import com.kukuou.cat.service.UserServcie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("usrList", userServcie.listUser());

        logger.error("我是指定的Controller内指定的error日志");
        logger.debug("我是指定的Controller内指定的debug日志");
        logger.info("我是指定的Controller内指定的info日志");
        return "user";
    }
    //http://localhost:8080/add?name=lzh&age=22
    @RequestMapping("/add")
    public String addUser(String name, Integer age) {
        userServcie.addUser(name, age);
        return "success";
    }

    @RequestMapping("/findByName")
    public String findByName(String name, ModelMap modelMap) {
        User byName = userServcie.findByName(name);
        if (byName == null) {
            throw new BusinessException("NOt_FOUND", "分类不存在");
        }
        modelMap.put("user", byName);
        return "detail";
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public void deleteUser(Long id) {
        userServcie.deleteUser(id);
    }


    @RequestMapping("/updateUser")
    public void updateUser(Long id, String name, Integer age) {
        userServcie.updateUser(id, name, age);
    }
}
