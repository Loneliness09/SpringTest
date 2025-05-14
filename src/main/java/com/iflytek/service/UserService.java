package com.iflytek.service;

import java.util.Map;

public interface UserService {
    int login(String name, String password);
    Map<String, Integer> getMap();
}
