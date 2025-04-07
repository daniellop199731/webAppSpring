package com.example.webapp.webappspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("tittle", "Hola Mundo Spring boot");
        model.addAttribute("userName", "Daniel");
        model.addAttribute("userLastName", "Lopez");
        return "details";
    }

}
