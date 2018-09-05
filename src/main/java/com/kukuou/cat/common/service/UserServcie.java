package com.kukuou.cat.common.service;

import com.kukuou.cat.entity.User;

import java.util.List;

/**
 * 用户
 * @author olx
 * @date 2018/9/5/005
 */
public interface UserServcie {
    /**
     * 新增
     */
    void addUser(String name, Integer age);

    /**
     * 删除
     * @param id
     * @return
     */
    Integer deleteUser(Long id);

    /**
     * 所有用户
     */
    List<User> listUser();

    /**
     * 更新
     */
    void updateUser(Long id,String name, Integer age);

}
