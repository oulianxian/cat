package com.kukuou.cat.service;

import com.kukuou.cat.entity.User;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    void addUser(String name, Integer age);

    /**
     * 删除
     * @param id
     * @return
     */
    @Transactional
    void deleteUser(Long id);

    /**
     * 所有用户
     */
    List<User> listUser();

    /**
     * 更新
     */
    @Transactional
    void updateUser(Long id,String name, Integer age);

}
