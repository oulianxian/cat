package com.kukuou.cat.common.service.serviceImpl;

import com.kukuou.cat.common.dao.UserDao;
import com.kukuou.cat.common.service.UserServcie;
import com.kukuou.cat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author olx
 * @date 2018/9/5/005
 */
@Service
public class UserServiceImpl implements UserServcie {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(String name, Integer age) {
        userDao.addUser(name, age);
    }

    @Override
    public Integer deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

    @Override
    public List<User> listUser() {
        return userDao.listUser();

    }

    @Override
    public void updateUser(Long id, String name, Integer age) {
        userDao.updateUser(id, name, age);

    }


}
