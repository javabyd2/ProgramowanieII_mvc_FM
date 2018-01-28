package com.sdabyd2.programowanie.Model;

import org.omg.CORBA.NO_IMPLEMENT;

public enum Fatigue {

    YES("yes"), NO("no"), SLEEPING("sleeping");


    private String title;

    Fatigue(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Fatigue{" + "title='" + title + '\'' + '}';
    }
}
