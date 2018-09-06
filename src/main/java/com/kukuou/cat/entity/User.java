package com.kukuou.cat.entity;

import javax.persistence.*;

/**
 * 用户
 *
 * @author olx
 * @date 2018/9/4/004
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private Long id;
    /**
     * 姓名
     */
    @Column(nullable = true)
    private String name;
    /**
     * 年龄
     */
    @Column(nullable = true)
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
