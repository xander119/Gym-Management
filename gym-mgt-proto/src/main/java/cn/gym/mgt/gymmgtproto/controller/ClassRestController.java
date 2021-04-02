package cn.gym.mgt.gymmgtproto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class ClassRestController {

    public ClassRestController() {
    }


    @GetMapping("/classes")
    public String hello() {
        return String.format("There are list of class there");
    }
}
