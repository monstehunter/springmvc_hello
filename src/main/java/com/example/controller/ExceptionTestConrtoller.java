package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lo
 * @version 1.0
 * @ClassName ExceptionTestConrtoller
 * @Description TODO
 * @date 2021/5/23 14:34
 */
@Controller
public class ExceptionTestConrtoller {

    @RequestMapping("/handle01")
    public String handle01(){
        int i = 10/0;
        return "success";
    }

}
