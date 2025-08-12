package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Manager {
    @Autowired
    private Employee employee;


    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
