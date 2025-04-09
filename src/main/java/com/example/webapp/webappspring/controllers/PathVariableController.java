package com.example.webapp.webappspring.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${config.default.message}")
    private String defaultMessage;

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

    @PostMapping("/create")
    public User create(@RequestBody User user){
        //En un ejemplo real, el metodo llamaria a la clase service que encamina 
        //guadar la info en BD
        user.setUserName(user.getUserName()+" req");
        user.setUserLastName(user.getUserLastname()+" req");
        user.setUserEmail(user.getUserEmail()+" req");
        return user;
    }

    @GetMapping("/configDefaultMessage")
    public Map<String, Object> configDefaultMessage(
            @Value("${config.default.listMessages}") String[] listMessages,
            @Value("${config.default.listMessages.with.specials.caracters}") List<String> specialsCaracters){
        Map<String, Object> json = new HashMap<>();
        json.put("defaultMessage", defaultMessage);
        json.put("defaultListMessages", listMessages);
        json.put("specialsCaracters", specialsCaracters);

        return json;
    }

}
