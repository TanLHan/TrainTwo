package com.neusoft.dao.impl;

import com.neusoft.dao.UserDao;
import com.neusoft.po.User;
import org.springframework.stereotype.Component;

/**
 * Author: tan
 * Date: 2022/6/7 13:55
 * FileName: UserDaoImpl
 * Description: 具体实现
 */
//Component--创建此类对象，并放在Spring容器中，@Component("XXX")给对象另取命
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser() {
        return new User(1,"test","111");
    }
}
