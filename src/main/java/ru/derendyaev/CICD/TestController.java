package ru.derendyaev.CICD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/love")
    public String test() {
        return "Love u so much and MISS uuuu!!!!!";
    }
}
