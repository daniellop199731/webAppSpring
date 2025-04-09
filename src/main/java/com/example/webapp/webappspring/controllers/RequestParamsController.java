package com.example.webapp.webappspring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.webappspring.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    //Si no se pone el required por defecto es true
    public ParamDto foo(@RequestParam(required = true, defaultValue = "Hola mundo") String message, 
                        @RequestParam(required = false, defaultValue = "0") Integer code) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(code);

        return param;
    }

    @GetMapping("/request")
    //http://localhost:8081/api/params/request?message=Hola que tal&code=117
    public ParamDto reques(HttpServletRequest request) {
        ParamDto param = new ParamDto();
        try{
            param.setCode(Integer.parseInt(request.getParameter("code")));
        } catch (NumberFormatException e){
            param.setCode(0);
        }
        param.setMessage(request.getParameter("message"));
        return param;
    }
    
    

}
