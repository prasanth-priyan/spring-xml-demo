package com.stackroute;

public class Movie {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String printActor(){
        return String.valueOf(this.actor);
    }
}
