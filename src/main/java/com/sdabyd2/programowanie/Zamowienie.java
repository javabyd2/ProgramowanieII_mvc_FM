package com.sdabyd2.programowanie;

public class Zamowienie {

    int iledodanych;
    int maksRozmiar;

    Pozycja[] pozycje = new Pozycja[iledodanych];

    public Zamowienie() {
        this.maksRozmiar = 10;

    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja pozycja) {

        pozycje[pozycje.length] = pozycja;


    }

    public double obliczWartoscZamowienia(Pozycja pozycja) {

        double wartoscZamowienia = 0;

        for (int i = 0; i < pozycje.length; i++) {

            wartoscZamowienia += pozycje[i].obliczWartoscPozycji(pozycja);
        }

        return wartoscZamowienia;
    }

//    public  String toString (Pozycja [] pozycje){
//
//
//    }

}
