package com.example.webapp.webappspring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.webapp.webappspring.models.User;


@Controller
@RequestMapping("/home")
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("tittle", "Hola Mundo Spring boot");
        model.addAttribute("userName", "Daniel");
        model.addAttribute("userLastname", "Lopez");
        return "details";
    }

    @GetMapping("/detailsWithObjUser")
    public String detailsWithObjUser(Model model) {
        User user = new User("Daniel OBJ", "Lopez OBJ");
        //user.setUserEmail("correo@correo.com");
        model.addAttribute("tittle", "Hola Mundo Spring boot");
        model.addAttribute("user", user);
        return "detailsWithObjUser";
    }

    @GetMapping("/detailsListOfUsers")
    public String detailsListOfUsers(ModelMap model) {

        List<User> users = new ArrayList<>();

        model.addAttribute("users", users);

        model.addAttribute("tittle", "Lista de usuarios");
        return "detailsListOfUsers";
    }
    
    

}
