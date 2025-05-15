package com.iflytek.controller;

import com.iflytek.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MyController {
    // 该方法的访问路径是/hello.do
    @RequestMapping("hello.do")
    public ModelAndView helloMVC() {
        System.out.println("hello SpringMVC！");
        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("msg", "在ModelAddView中处理了hello.do的请求");
        mv.addObject("fun", "执行了helloMVC方法");
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "studentParam.do", method = RequestMethod.POST)
    public void getStudent(@RequestBody Student student, HttpServletResponse response) throws IOException {
        System.out.println(student);
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().write(student.toString());
    }

    @RequestMapping(value = "hello.do", params = {"name"})
    public ModelAndView hello1(String name) {
        System.out.println(name);

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("name", name);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "goods.do", params = {"name", "price", "num"})
    public ModelAndView hello1(String name, int price, int num) {
        System.out.println(name + " " + price + "元 " + num + "个");

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("name", name);
        mv.addObject("price", price);
        mv.addObject("num", num);
        //指定视图，setviewName("视图路径")  相当于请求转发request.getRequestDis...("/show.jsp").forward(..)
        //当配置了视图解析器，使用文件名称作为视图名使用，叫做视图逻辑名称
        //使用了逻辑名称，框架使用配置文件中视图解析器的前缀和后缀，拼接为完整地视图路径 ，例如/WEB-INF/view/ + goodsPost + .jsp
        mv.setViewName("goodsPost");
        return mv;
    }

    @RequestMapping(value = "getGoods.do")
    public String getGoods() {
        return "goods";
    }

    @RequestMapping(value = "getJsTest.do")
    public String getJsTest() {
        return "jsTest";
    }

}