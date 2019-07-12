package com.stackroute;

import com.stackroute.Demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie) applicationContext.getBean("movie1");
        System.out.println(movie.getActor());
    }
}
