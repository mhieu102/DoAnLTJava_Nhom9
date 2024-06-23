package com.example.DoAnLTJava_Nhom9.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index.html")
    public  String Index(){
        return "index";
    }
    @GetMapping("/book.html")
    public  String Contact(){
        return "book";
    }
    @GetMapping("menu.html")
    public  String Program(){
        return "menu";
    }
    @GetMapping("about.html")
    public  String About(){
        return "about";
    }
}
