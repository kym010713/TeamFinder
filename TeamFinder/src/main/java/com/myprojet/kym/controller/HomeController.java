package com.myprojet.kym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "영");
        return "index"; // templates/hello.html 로 이동
    }
}
