package com.ferrys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@SpringBootApplication
public class SimpleHttpServer {
    public static void main(String[] args) {
        SpringApplication.run(SimpleHttpServer.class, args);
    }
}

@RestController
@RequestMapping("/api/v1")
class HelloController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of("message", "hello from the server");
    }
}
