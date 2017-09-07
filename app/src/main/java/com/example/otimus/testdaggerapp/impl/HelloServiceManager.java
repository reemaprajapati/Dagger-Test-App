package com.example.otimus.testdaggerapp.impl;

import com.example.otimus.testdaggerapp.api.HelloService;

/**
 * Created by Otimus on 9/6/2017.
 */

public class HelloServiceManager implements HelloService {
    @Override
    public String greet(String userName) {
        return "Hello" +userName;
    }
}
