package com.sda.study.springbootpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Bahadir Tasli
 * @Date 3/20/2023
 */
@Controller
public class HomeController {
    @GetMapping
    public String showHomePage() {
        return "home";
    }
}
