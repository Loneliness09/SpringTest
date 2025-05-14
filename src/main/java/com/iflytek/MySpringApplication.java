package com.iflytek;


import com.iflytek.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApplication {
    static ApplicationContext app;
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        app = new AnnotationConfigApplicationContext(AppConfig.class);
        app = new ClassPathXmlApplicationContext("Application.xml");
        UserService userService = (UserService) app.getBean("userService");
        UserService userService1 = (UserService) app.getBean("userService");
        System.out.println(userService==userService1);
        String userName = "aaa";
        String password = "123";
        int success = userService.login(userName, password);
        System.out.println(userName + "登录" + (success==1 ? "成功" : "失败"));
        System.out.println(userService.getMap());
    }
}
