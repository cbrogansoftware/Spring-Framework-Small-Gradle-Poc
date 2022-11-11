package org.cbrogansoftware.spring.di.service;

import org.springframework.stereotype.Service;

@Service
public class Writer implements IWriter {
    @Override
    public void writer (String s){
        System.out.println("-------------------------------");
        System.out.println("The string is (Writer implements IWriter): " + s);
        System.out.println("-------------------------------");
    }
}