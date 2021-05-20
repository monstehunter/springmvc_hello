package com.example.controller;

import com.example.book.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lo
 * @version 1.0
 * @ClassName HelloController
 * @Description TODO
 * @date 2021/5/18 11:07
 */
@Deprecated
@Controller
public class HelloController {

    @RequestMapping("/book")
    public String addBook(Book book){
        System.out.println(book);
        return "success";

    }
}
