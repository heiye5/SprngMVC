package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo2 {
    @RequestMapping("/h2")
    public String Test(Model model){
        model.addAttribute("msg","ControllerDemo2");

        return "hello";
    }

    @RequestMapping("/h3")
    public String Test3(Model model){
        model.addAttribute("msg","ControllerDemo2");

        return "hello";
    }
}
