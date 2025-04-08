package com.example.webapp.webappspring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
}
