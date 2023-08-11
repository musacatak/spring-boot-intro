package com.catak.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hello",
                List.of("Java", "JavaScript", "C"),
                new Person("Ahmet", 24, 15000));
    }
}
