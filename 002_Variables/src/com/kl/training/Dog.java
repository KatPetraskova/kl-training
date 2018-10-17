package com.kl.training;

public class Dog {
    /* veskere tridy jsou objekty; tady neni main metoda */

    /* Vlastnosti objektu */
        /* Instancni promenne - bez vytvoreni objektu nelze modifikovat, ani cist */
    public String jmeno;
    public String barvaSrsti;
    public String plemeno;
    public double vaha;

        /* Staticke promenne - lze modifikovat i cist bez tvorby objektu;
         *                  - vlastnost bude mit jiz pri svem vytvoreni */
   int pocetKoncetin = 4;

   /* Konstruktor - pomoci nej pridelujeme hodnoty instancnim promennym objektu
    * - ma stejny nazev jako jmeno tridy */
   public Dog (String jmeno, String barvaSrsti, String plemeno, double vaha) {

       System.out.println("Jmeno psa: " + jmeno);
       System.out.println("Barva srsti: " + barvaSrsti);
       System.out.println("Plemeno: " + plemeno);
       System.out.println("Vaha: " + vaha);
   }

   /* Metoda objektu Dog */
    public void bark(){
        System.out.println("HAF!");
    }



}
