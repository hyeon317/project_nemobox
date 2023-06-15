package com.shop.controller;

import com.shop.ShopApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/intro")
public class IntroController {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @GetMapping(value = "/cafe")
    public String CafeIntro() {
        return "introduction/cafeIntro";
    }

    @GetMapping(value = "/menu")
    public String MenuIntro() {
        return "introduction/menuIntro";
    }
}


