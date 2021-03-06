package com.neusoft.service.impl;

import com.neusoft.dao.UserDao;
import com.neusoft.po.User;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: tan
 * Date: 2022/6/7 13:59
 * FileName: UserServiceImple
 * Description: service具体实现层
 */

@Component("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser() {
        return userDao.getUser();
    }
// UserDao 属性制动注入，所以就可以不用get/set方法
//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
}
