package com.iflytek;

import com.iflytek.dao.UserDao;
import com.iflytek.dao.impl.UserDaoImpl;
import com.iflytek.service.UserService;
import com.iflytek.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="UserDao")
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

    @Bean(name="UserService")
    public UserService getUserService(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }
}
