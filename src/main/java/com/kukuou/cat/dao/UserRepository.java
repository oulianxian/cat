package com.kukuou.cat.dao;

import com.kukuou.cat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author olx
 * @date 2018/9/5/005
 */
public interface UserRepository extends JpaRepository<User,Long> {
    @Modifying
    @Query("update User set name =?2 ,age =?3  where id = ?1")
    void updateUser(Long id, String name, Integer age);


}
