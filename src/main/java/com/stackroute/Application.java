package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Application
{
    public static void main( String[] args )
    {
        //using configurable Application context to close the context
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean= (BeanLifecycleDemoBean) context.getBean("beanlifecycle-id");
        BeanPostProcessor beanpostprocessor = (BeanPostProcessor) context.getBean("processordemodean-id");
        System.out.println(beanLifecycleDemoBean.getName());
        context.close();
    }
}
