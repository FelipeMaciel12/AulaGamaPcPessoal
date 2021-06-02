package br.maciel.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // Controller do tipo Rest
@CrossOrigin("*") // receber requisições de outras origens. Qualquer uma.
@RequestMapping("/sample") // Toda vez que vier resquisições desse tipo essa classe responderá

public class HelloController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!!";
    }

}
