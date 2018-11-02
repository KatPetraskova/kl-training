package com.kl.training.II;

public class Morce {


    public String barva;
    public String typSrsti;
    public String jmeno;
    public String pohlavi;
    public double vaha;
    public boolean hlad;


      public Morce (String barva, String typSrsti, String jmeno, String pohlavi, double vaha) {

        System.out.println(" ");
        System.out.println("Jmeno: " + jmeno);
        System.out.println("Typ srsti: " + typSrsti);
        System.out.println("Barva: " + barva);
        System.out.println("Pohlavi: " + pohlavi);
        System.out.println("Vaha: " + vaha);
        System.out.println(" ");
    }

   /* Metoda objektu Morce - Popcorning */

    public void popcorning(){
        System.out.println(" ");
        System.out.println("Hop-hop!");
        hlad=false; System.out.println("Chci si hrát!");
        System.out.println(" ");
    }


    /* Metoda objektu Morce - Piskani */

    public void piskani(){
        System.out.println(" ");
        System.out.println("Uii-uiii!");
        hlad=true; System.out.println("Nakrmit!");
        System.out.println(" ");
    }


    /* Metoda objektu Morce - Zrani */

    public void zrani(){
        System.out.println(" ");
        System.out.println("CHRAMST!");
        hlad=false; System.out.println("Už nemám hlad.");
        System.out.println(" ");
    }


}
