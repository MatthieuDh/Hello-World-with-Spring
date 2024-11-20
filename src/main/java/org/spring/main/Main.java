package org.spring.main;

import org.spring.config.ProjectConfig;
import org.spring.services.HelloWorldService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        HelloWorldService helloWorld = context.getBean(HelloWorldService.class);
        System.out.println(helloWorld.getHelloMessage());
    }
}