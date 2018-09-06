package com.kukuou.cat.dao;

import com.kukuou.cat.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 开发者唯一要做的就只是声明持久层的接口，其他都交给 Spring Data JPA 来帮你完成
 * 		开发一般分三个步骤
 * 		1.声明持久层的接口，该接口继承 Repository
 * 		2:在接口中声明需要的业务方法
 * @author olx
 * @date 2018/9/5/005
 */
@CacheConfig(cacheNames = "user")
public interface UserRepository extends JpaRepository<User,Long> {
    @Modifying
    @Query("update User set name =?2 ,age =?3  where id = ?1")
    void updateUser(Long id, String name, Integer age);

    /**
     * 通过名字查询用户
     * @param name
     * @return
     */
    @Cacheable
    User findByName(String name);
}
