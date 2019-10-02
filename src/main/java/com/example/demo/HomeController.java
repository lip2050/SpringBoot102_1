package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model m){
        m.addAttribute("myvar1", "Hi everybody.");
        m.addAttribute("myvar2", "Nice meeting you all.");
        return "hometemplate";

    }
}
