package com.example.deploy02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")
public class BasicController {

    @GetMapping
    public int randomSum(){
        Random random = new Random();
        return random.nextInt() + random.nextInt();
    }
}
