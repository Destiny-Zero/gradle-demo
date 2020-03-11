package org.gradle.dao;

import org.gradle.model.User;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface UserDao {
    /**
     * getUserList() 获取用户信息列表
     * @author Leo
     * @date  2019/5/22
     * @return java.util.List<pers.gradle.model.User>
     **/
    List<User> getUserList();
}
