package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")
    public String about(Model model){
        return "about";
    }

    @GetMapping("/main")
    public String main(Model model){
        return "main";
    }
    
    @GetMapping("/board")
    public String board(Model model){
        return "board";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
}
