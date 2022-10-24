package com.wty.pushtest.congtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class TestController {
    @GetMapping("aa")
    public String test(){
        return null;
    }
}
