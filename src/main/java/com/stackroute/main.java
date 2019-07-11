package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movieFirst = (Movie) xmlBeanFactory.getBean("movie1");
        Movie moviesecond = (Movie) xmlBeanFactory.getBean("movie2");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) applicationContext.getBean("movie3");
        Movie movie3 = (Movie) applicationContext.getBean("movie3");

        Movie movie2 = (Movie) applicationContext.getBean("movie2");
        System.out.println(movieFirst.getActor());

        System.out.println(movie.getActor());
        System.out.println("Beans with Scope Prototype: Are they same?");
        System.out.println(movie == movie3);
        System.out.println("Beans with Scope Singleton: Are they same?");
        System.out.println(movieFirst == moviesecond);

    }
}
