package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lo
 * @version 1.0
 * @ClassName YouController
 * @Description TODO
 * @date 2021/5/17 16:47
 */
@Deprecated
@Controller
public class YouController {
    @RequestMapping("/handle")
    public String handle(){
        return "success";
    }

    @RequestMapping("/test0?")
    public String test(){
        System.out.println("test0?....");
        return "success";
    }
}
