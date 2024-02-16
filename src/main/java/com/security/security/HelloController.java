package com.security.security;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

//    @PreAuthorize(value = ("FATHER"))  **Bu tarz da yetkilendirme yapılabiliyor.**
    @GetMapping("/father")
    public String  hello(){
        return "Hello father";
    }

    @GetMapping("/mother")
    public String  hello2(){
        return "Hello2 mother";
    }
    @GetMapping
    public String  giris(){
        return "Welcome";
    }


}
