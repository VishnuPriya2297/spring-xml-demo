package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Application
{
    public static void main( String[] args )
    {
        //using ApplicationContext to create the bean
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movieA", Movie.class);
        Movie movie1 = context.getBean("movie", Movie.class);
       // System.out.println(movie==movie1);
        System.out.println(movie1.toString());
    }
}
