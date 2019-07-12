package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean  {
    String name;
//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //init method
    public void custominit(){
        System.out.println("MyService init method called");
    }
    //destroy method
    public void customdestroy(){
        System.out.println("MyService destroy method called");
    }


}
