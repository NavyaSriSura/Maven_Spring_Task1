package com.stackroute;

import com.stackroute.Demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemoBean beanLifeCycleDemo=(BeanLifeCycleDemoBean) applicationContext.getBean("cycle");
    }
}
