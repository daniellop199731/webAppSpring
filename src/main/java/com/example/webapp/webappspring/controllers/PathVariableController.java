package com.example.webapp.webappspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.webappspring.models.User;
import com.example.webapp.webappspring.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    /*
     * Es mas recomendable usar PathVariable para API Rest
     */

    @GetMapping("/baz/{message}/{code}")
    //Funciona con 1, 2, 3 ..etc parametros
    //http://localhost:8081/api/var/baz/Hola/177
    public ParamDto baz(@PathVariable String message, @PathVariable Integer code){

        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(code);

        return param;
    }

}
