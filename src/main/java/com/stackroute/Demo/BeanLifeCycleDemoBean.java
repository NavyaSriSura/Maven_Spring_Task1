package com.stackroute.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemoBean beanLifeCycleDemoBean = (BeanLifeCycleDemoBean) applicationContext.getBean("cycle");
    }
        @Override
        public void afterPropertiesSet () throws Exception {
            System.out.println("After properties");
        }

        public void clean () {
            System.out.println("Custom Destroy");
        }
public void Init()
{
    System.out.println("Initialisation");
}
        @Override
        public void destroy () throws Exception {
            System.out.println("Destroy");
        }
    }
