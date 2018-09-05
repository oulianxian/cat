package com.kukuou.cat.dao;

import com.kukuou.cat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author olx
 * @date 2018/9/5/005
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void addUser(String name, Integer age) {
        String sql = "insert into USER(NAME,AGE) values(?,?)";
        jdbcTemplate.update(sql, name, age);
    }

    @Transactional
    public Integer deleteUser(Long id) {
        String sql = "delete from User where id = ?";
        jdbcTemplate.update(sql, id);
        return null;
    }


    public List<User> listUser() {
        String sql = "select * from User ";
        RowMapper<User> mapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        };
        return jdbcTemplate.query(sql,mapper);
    }

    @Transactional
    public void updateUser(Long id, String name, Integer age) {
        String sql = "update USER set name =? ,age =?  where id = ?";
        jdbcTemplate.update(sql, name, age, id);

    }
}
