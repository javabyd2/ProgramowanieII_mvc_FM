package com.sdabyd2.programowanie.Model;

public enum Nourishment {

    HUNGRY("hungry"), FULL("full"), EATING("eating");

    private String title;

    Nourishment(String title) {

        this.title = title;
    }

    @Override
    public String toString() {
        return "Nourishment{" + "title='" + title + '\'' + '}';
    }
}
