package org.cbrogansoftware.spring.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MySpringBeanWithDependency {
    private IWriter writer;

    @Autowired
    @Qualifier("writer")
    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void printIt() {
        String s = "MySpringBeanWithDependency printIt called";
        writer.writer(s);
    }

}