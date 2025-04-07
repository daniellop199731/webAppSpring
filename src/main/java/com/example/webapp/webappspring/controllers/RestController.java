package com.example.webapp.webappspring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/details2")
    public Map<String, Object> details(){
        Map<String, Object> mpJson = new HashMap<>();
        
        mpJson.put("tittle", "Hola Mundo Spring boot");
        mpJson.put("userName", "Daniel");
        mpJson.put("userLastName", "Lopez");

        return mpJson;
    }
    
}
