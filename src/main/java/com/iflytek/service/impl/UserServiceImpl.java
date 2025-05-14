package com.iflytek.service.impl;

import com.iflytek.dao.UserDao;
import com.iflytek.dao.impl.UserDaoImpl;
import com.iflytek.service.UserService;

import javax.jws.soap.SOAPBinding;
import java.util.Map;

public class UserServiceImpl implements UserService {

    UserDao userDao;
    String token;
    Map<String, Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int login(String name, String password) {
        System.out.println(name + " login. token: " + token);
        return userDao.login(name, password);
    }

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

}
