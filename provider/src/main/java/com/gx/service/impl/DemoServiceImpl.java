package com.gx.service.impl;

import com.gx.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
