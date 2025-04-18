package com.example.webapp.webappspring.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.webapp.webappspring.models.User;
import com.example.webapp.webappspring.models.dto.UserDto;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/details")
    public Map<String, Object> details(){
        Map<String, Object> mpJson = new HashMap<>();
        
        mpJson.put("tittle", "Hola Mundo Spring boot");
        mpJson.put("userName", "Daniel");
        mpJson.put("userLastName", "Lopez");

        return mpJson;
    }

    @GetMapping("/detailsWithObjUser")
    public Map<String, Object> detalisWithObjUser(){
        Map<String, Object> mpJson = new HashMap<>();
        User user = new User("Daniel", "Lopez");

        mpJson.put("tittle", "Hola Mundo Spring boot");
        mpJson.put("user", user);

        return mpJson;

    }
    @GetMapping("/detailsWithUserDto")
    public UserDto detailsWithUserDto() {      
        UserDto userDto = new UserDto();  
        User user = new User("Daniel", "Lopez");
        userDto.setTittle("Hola Mundo Spring boot");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/listOfUsers")
    public List<User> listOfUsers() {
        User user = new User("Daniel", "Lopez");
        User user2 = new User("Andres", "Guzman");
        User user3 = new User("Camila", "Montoya");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        //Otra forma de llenar una List
        //List<User> users2 = Arrays.asList(user, user2, user3);

        return users;
    }
    
    
    
}
