package com.example.testgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xiaoky
 * @date 2019-08-25
 */
@RestController
public class TestController {

    /**
     * 测试方法
     * @return String
     */
    @GetMapping(value = "/test")
    public  String test() {
        return "Hello world";
    }

    /**
     * 测试方法2
     * @return String
     */
    @GetMapping(value = "/test2")
    public  String test2() {
        return "Hello world Twofd";
    }
}
