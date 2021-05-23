package com.example.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lo
 * @version 1.0
 * @ClassName ErrorController
 * @Description TODO
 * @date 2021/5/23 14:55
 */
@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(value = {Exception.class})
    public ModelAndView handleException01(Exception exception){
        ModelAndView view = new ModelAndView("myError");
        view.addObject("ex",exception);
        return view;
    }
}
