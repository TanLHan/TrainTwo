package com.neusoft.po;

/**
 * Author: tan
 * Date: 2022/6/7 13:42
 * FileName: User
 * Description: 创建实体类User然好创建dao接口实现类
 */

public class User {
    private int uid;
    private String username;
    private String password;

    public User(){};


    // 构建
    public User(int uid,String username,String password){
        super();
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
