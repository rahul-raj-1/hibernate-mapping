package com.example.hibernatemapping.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyInterfaceImplementationsHolder {

    @Autowired
    private Map<String, Print> implementations;

    public Print get(String impl) {
        System.out.println(" this.implementations.get(impl) "  + this.implementations.get(impl) );

        return this.implementations.get(impl);
        
    }
}