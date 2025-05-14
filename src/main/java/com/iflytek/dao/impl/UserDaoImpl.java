package com.iflytek.dao.impl;

import com.iflytek.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int login(String name, String password) {
        if (name.equals("aaa") && password.equals("123")) {
            return 1;
        } else {
            return 0;
        }
    }
}
