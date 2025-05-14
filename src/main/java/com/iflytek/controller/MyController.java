package com.iflytek.controller;

import com.iflytek.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    // 该方法的访问路径是/c1/hello1
    @RequestMapping("hello.do")
    public ModelAndView helloMVC() {
        System.out.println("hello SpringMVC！");
        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("msg", "在ModelAddView中处理了hello.do的请求");
        mv.addObject("fun", "执行了helloMVC方法");
        //指定视图，setviewName("视图路径")  相当于请求转发request.getRequestDis...("/show.jsp").forward(..)
//        mv.setViewName("/WEB-INF/view/show.jsp");
        //当配置了视图解析器，使用文件名称作为视图名使用，叫做视图逻辑名称
        //使用了逻辑名称，框架使用配置文件中视图解析器的前缀和后缀，拼接为完整地视图路径 ，例如/WEB-INF/view/ + show + .jsp
        mv.setViewName("hello");


        /*
        当框架调用完dosome方法后，得到返回中modelandview  框架会在后续的处理逻辑值，处理mv对象里的数据和视图
        对数据执行requert，setAttribute(“msg”，“处理了some.do请求”)；把数据放到request作用域中
        对视图进行转发操作
         */
        return mv;
    }

    @RequestMapping("studentParam.do")
    public void getStudent(Student student) {
        System.out.println(student);
    }

    @RequestMapping(value = "hello.do", params = {"name"})
    public ModelAndView hello1(String name) {
        System.out.println(name);

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("name", name);
        //指定视图，setviewName("视图路径")  相当于请求转发request.getRequestDis...("/show.jsp").forward(..)
//        mv.setViewName("/WEB-INF/view/show.jsp");
        //当配置了视图解析器，使用文件名称作为视图名使用，叫做视图逻辑名称
        //使用了逻辑名称，框架使用配置文件中视图解析器的前缀和后缀，拼接为完整地视图路径 ，例如/WEB-INF/view/ + show + .jsp
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
//        mv.setViewName("/WEB-INF/view/show.jsp");
        //当配置了视图解析器，使用文件名称作为视图名使用，叫做视图逻辑名称
        //使用了逻辑名称，框架使用配置文件中视图解析器的前缀和后缀，拼接为完整地视图路径 ，例如/WEB-INF/view/ + show + .jsp
        mv.setViewName("goodsPost");
        return mv;
    }
    @RequestMapping(value = "getGoods.do")
    public String getGoods() {
        return "goods";
    }
}