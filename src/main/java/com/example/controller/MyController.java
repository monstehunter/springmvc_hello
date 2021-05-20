package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lo
 * @version 1.0
 * @ClassName MyController
 * @Description TODO
 * @date 2021/5/17 11:31
 */
@Deprecated
@Controller
public class MyController {
    @RequestMapping("/some.do")
    public ModelAndView doSome(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","hello world");
        modelAndView.addObject("fun","doSome");
        modelAndView.setViewName("show");

        return modelAndView;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
