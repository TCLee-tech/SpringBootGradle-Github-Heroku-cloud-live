package org.generation.deployproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
class HelloController
{
    @GetMapping("/")
    String hello() {
        return "Hello World. WHATSSSSSSSSUP !!!!";
    }
}
