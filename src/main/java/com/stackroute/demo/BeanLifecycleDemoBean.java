package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//implementing IntializingBean and DisposableBean 
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //defining an init menthod
    public void custominit(){
        System.out.println("MyService init method called");
    }
    //defining a destroy method
    public void customdestroy(){
        System.out.println("MyService destroy method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy....");
        
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properities set ");

    }
}
