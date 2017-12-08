package com.codistica.better.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Grzegorz Swierczek
 * Created on 2017-12-08
 * Contact g.swierczek@gmail.com
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
