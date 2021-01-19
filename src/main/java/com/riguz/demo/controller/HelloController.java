package com.riguz.demo.controller;

import com.riguz.shared.DemoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    DemoRepository demoRepository = new DemoRepository();

    @GetMapping("/hello")
    public List<String> hello() {
        return demoRepository.getNames();
    }
}
