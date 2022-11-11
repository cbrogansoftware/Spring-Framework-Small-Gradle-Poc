package org.cbrogansoftware.springframeworksmallgradlepoc;

import org.cbrogansoftware.spring.di.service.Config;
import org.cbrogansoftware.spring.di.service.MySpringBeanWithDependency;
import org.cbrogansoftware.spring.di.service.MySpringBeanWithDependency2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MySpringBeanWithDependency springBean = context.getBean(MySpringBeanWithDependency.class);
        MySpringBeanWithDependency2 springBean2 = context.getBean(MySpringBeanWithDependency2.class);

        springBean.printIt();
        springBean2.printIt();
        context.close();
    }
}