package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lo
 * @version 1.0
 * @ClassName InterceptorTestController
 * @Description TODO
 * @date 2021/5/23 13:43
 */
@Controller
public class InterceptorTestController {

    @RequestMapping("/test01")
    public String test01(){
        System.out.println("test01...");
        return "success";
    }
}
