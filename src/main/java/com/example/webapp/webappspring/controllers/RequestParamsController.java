package com.example.webapp.webappspring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.webappspring.models.dto.ParamDto;

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
    

}
