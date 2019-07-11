package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie.getActor());

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 = xmlBeanFactory.getBean("movie", Movie.class);
        System.out.println("using XMLBean Factory  " + movie1.getActor());

        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2 = factory.getBean("movie", Movie.class);
        System.out.println("using Bean factory " + movie2.getActor());
    }
}
