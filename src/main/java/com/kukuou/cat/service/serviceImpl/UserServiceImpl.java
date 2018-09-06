package com.kukuou.cat.service.serviceImpl;

import com.kukuou.cat.dao.UserRepository;
import com.kukuou.cat.entity.User;
import com.kukuou.cat.service.UserServcie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author olx
 * @date 2018/9/5/005
 */
@Service
public class UserServiceImpl implements UserServcie {
    //@Autowired
    //private UserDao userDao;
    @Autowired
    private UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void addUser(String name, Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        userRepository.save(user);
    }

    @Override
    public  void deleteUser(Long id) {
          userRepository.deleteById(id);
    }

    @Override
    public List<User> listUser() {
        logger.error("我是非指定的Dao内指定的error日志");
        logger.debug("我是非指定的Dao内指定的debug日志");
        return userRepository.findAll();

    }

    @Override
    public void updateUser(Long id, String name, Integer age) {
        userRepository.updateUser(id, name, age);

    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

}
