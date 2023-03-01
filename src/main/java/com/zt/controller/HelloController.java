package com.zt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","<h1>zt</h1>");
        return "index";
    }
}
