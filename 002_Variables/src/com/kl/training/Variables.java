package com.kl.training;

/**
* @author Katka
*
 * This is basic documentation for Variables class
 * 09.10.2018
 * obecne se dokumentace pise jak nad tridou, tak nad metodou
 */
public class Variables {
    /**
     * This is main method which serves as start of program
     * @param args - input arguments
     */
    public static void main (String [] args) {
        // jednoradkovy komentar - Line comment - jenom z jedne strany //
        /* viceradkovy komentar - konec je */
        /* Line comment 1
            * Line comment 2
            * Line comment 3
        */

        /*
            Byte
                   - cele cislo
                   - velikost 8 bitu = 1 byte
                   - minimální hodnota = -128
                   - max. hodnota = 127
         */
        byte myByte = 1;
        // byte myByte2 = 150; // nelze pouzit z duvodu prekroceni maximalni hodnoty

        /*
            Short
                - cele cislo
                - velikost 16 bitu (2 byty)
                - minimalni hodnota = -32 768
                - maximalni hodnota = 32 767
         */
        short myShort = 10000; // cisla vzdy dohromady, desetin.tecka

        /*
            Integer
                - cele cislo
                - velikost 32 bitu (4 byty)
                - min.hodnota = - 2 147 483 648
                - max. hodnota = -2 147 483 647
         */
        int myInt = 2000000000;

        /*
            Long
                - cele cislo
                - velikost 64 bitu (8 bytu)
                - min. velikost = -9 223 372 036 854 775 808
                - max. hodnota = 9 223 372 036 854 775 807
         */
        long myLong = 0; // vice prikazu na jeden radek nepouzivat

        /*
            Float
                - realne cislo
                - velikost 32 bitu (4 byty)
                - min.hodnota = -3.40282e+38
                - max.hodnota = 3.40282e+38
         */
        float myFloat = 10.001F; // float potrebuje na konci cifry identifikator F

        /*
            Double
                - realne cislo
                - velikost 64 bitu (8 bytu)
                - min.hodnota = -1.79769e+308
                - max.hodnota = 1.79769e+308
         */
        double myDouble = 10.001; // lze pouzit i zde identifikator D
        double myDouble2 = 10.001D;

        /*
            Char
                - znak Unicode (znakova sada, ktera obsahuje veskere znaky)
                - velikost 16 bitu (2 byty)
                - min.hodnota /u0000
                - max.hodnota /uFFFF
         */
        char myChar = 'a'; // musi byt jenom 1 znak; pise se do jednoduchych uvozovek

        /*
            Boolean
                - logicka hodnota
                - velikost 1 bit
                - nabyva hodnot true nebo false (1 nebo 0)
         */
        boolean myBoolean = true; // vzdy se pise slovy, ne cisla (1/0)

        /*
        Retezec (String) - seskupeni jednotlivych znaku - referencni datove typy
                     */

        String myString = "Hello World";

        /*
            Pole (Array) - musi byt urciteho datoveho typu
            - staticka, uz pak nejde menit jejich velikost
         */

        int[] myIntArray = {1, 2};
        int[] myIntArray2 = new int [2]; // dvojka - delka pole
            myIntArray2 [0] = 10;
            myIntArray2 [1] = 20;
            // int [] myIntArray = {10, 20};

        String [] myStringArray = {"Prvek1", "Prvek2", "Prvek3"};
        String [] myStringArray2 = new String [3];
            myStringArray2 [0] = "Prvek1";
            myStringArray2 [1] = "Prvek2";
            myStringArray2 [2] = "Prvek3";

        /*
            primitivni datove typy objektove
         */

        int a = 1;
        Integer b = 2; // je to objekt, tzn. referencni dat.typ
    }
}
