package com.zt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class TestController {
@RequestMapping("/test")
    public String test(Model model){
    model.addAttribute("usrs", Arrays.asList("k","l"));
return "test";
}
}
