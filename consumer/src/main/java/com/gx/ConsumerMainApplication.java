package com.gx;

import com.gx.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
