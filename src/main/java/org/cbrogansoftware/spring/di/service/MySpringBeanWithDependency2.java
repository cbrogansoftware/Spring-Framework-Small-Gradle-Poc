package org.cbrogansoftware.spring.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MySpringBeanWithDependency2 {
    private IWriter writer;

    @Autowired
    @Qualifier("niceWriter")
    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void printIt() {
        String s = "MySpringBeanWithDependency2 printIt called";
        writer.writer(s);
    }

}