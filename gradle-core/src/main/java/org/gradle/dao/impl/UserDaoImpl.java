package org.gradle.dao.impl;


import org.gradle.dao.UserDao;
import org.gradle.model.User;

import org.utils.TimeUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getUserList() {
        List<User> userList=new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setSex("男");
        String birthday = "1996-5-8";
        user.setBirthday(birthday);
        int age = TimeUtils.getAgeByBirthDay(birthday);
        user.setAge(age);
        userList.add(user);
        return userList;
    }
}
