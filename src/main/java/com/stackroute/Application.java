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


/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        //using Application Context

      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= (Movie) context.getBean("movie");
        System.out.println(movie.getActor());


        //using bean Factory

        /*XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie= (Movie) factory.getBean("movie");
        System.out.println(movie.getActor());

        //Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader

       BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie m=((DefaultListableBeanFactory)beanDefinitionRegistry).getBean(Movie.class);
        System.out.println(m.getActor());*/







    }

}
