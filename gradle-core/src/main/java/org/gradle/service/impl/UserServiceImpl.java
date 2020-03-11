package org.gradle.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.gradle.dao.UserDao;
import org.gradle.model.User;
import org.gradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList(){
        return userDao.getUserList();
    }
}
