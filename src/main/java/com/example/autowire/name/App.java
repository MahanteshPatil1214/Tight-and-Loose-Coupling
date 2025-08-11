package com.example.autowire.name;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws BeansException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowireByName.xml");

        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
