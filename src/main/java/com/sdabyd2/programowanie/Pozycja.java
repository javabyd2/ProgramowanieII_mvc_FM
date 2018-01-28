package com.sdabyd2.programowanie;

public class Pozycja {

    String nazwaTowaru;
    int ileSztuk;
    double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {

        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartoscPozycji(Pozycja pozycja) {

        return pozycja.cena * pozycja.ileSztuk;
    }


    public String toString(Pozycja pozycja) {

        return pozycja.nazwaTowaru + " " + pozycja.cena + " " + pozycja.ileSztuk + " " + pozycja.obliczWartoscPozycji(pozycja);
    }
}
