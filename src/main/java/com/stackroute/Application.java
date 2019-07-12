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

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= (Movie) context.getBean("movie-id1");
        Movie movie1=(Movie) context.getBean("movie-id2") ;
        movie.display();
        movie1.display();

      /*  Movie movie2= (Movie) context.getBean("movie-id2");
        Movie movie5= (Movie) context.getBean("movie-id2");
        movie2.display();
        Movie movie3= (Movie) context.getBean("movie-id3");
        Movie movie4=(Movie)context.getBean("movie-id3") ;
        movie3.display();
        System.out.println(movie3==movie4);*/
        System.out.println(movie==movie1);


    }

}
