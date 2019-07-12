package com.stackroute.domain;

import java.util.List;

public class Movie {

    List<Actor> actor;



    public Movie(List<Actor> actor) {
        this.actor = actor;

    }



    public void display()
    {
        System.out.println(actor.toString());

    }

}
