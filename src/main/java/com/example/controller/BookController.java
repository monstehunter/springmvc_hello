package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lo
 * @version 1.0
 * @ClassName BookDao
 * @Description TODO
 * @date 2021/5/17 21:02
 */
@Deprecated
@RequestMapping("/bookTest")
@Controller
public class BookController {
    @RequestMapping(value = "/{bid}", method = RequestMethod.POST)
    public String addBook(@PathVariable("bid")Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/{bid}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("bid")Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/{bid}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("bid")Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/{bid}", method = RequestMethod.GET)
    public String getBook(@PathVariable("bid")Integer id){
        System.out.println(id);
        return "success";
    }
}
