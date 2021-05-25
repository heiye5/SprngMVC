package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class ControllerDemo3 {

    @RequestMapping("/h3")
    public String Test(Model model){
        model.addAttribute("msg","jkdf");
        return "hello";
    }
}
