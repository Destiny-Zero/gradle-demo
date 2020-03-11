package org.gradle.service;

import org.gradle.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService {
    /**
     * getUserList() 获取User列表
     * @author Leo
     * @date 10:27 2019/5/22
     * @return java.util.List<pers.gradle.model.User>
     **/
    List<User> getUserList();
}

