package com.kl.training.II;

/**
 * @author Katka
 * This is basic documentation for Variables class
 * 01. 11. 2018
 */

public class Variables {

    /**
     * This is main method which serves as start of program "Vylet materske skolky do ZOO"
     * @param args - input arguments
     */

    public static void main (String [] args) {

        /* Vylet materske skolky do ZOO */

        /*
        String[] mhd = new String[5];

        mhd[0] = "paní učitelka";
        mhd[1] = "Honzík";
        mhd[2] = "Vašík";
        mhd[3] = "Lenka";
        mhd[4] = "Mája";

        System.out.println ("Jméno dítěte na posledním místě: " + mhd[4]);

        */

        /* Prvni objekt - Morce 1 */
        Morce morce1 = new Morce("cerna","hladka", "Mysak","samec", 500);

        /* Druhy objekt - Morce 2 */
        Morce morce2 = new Morce ("cernobila", "kudrnatá", "Pipikos", "samec", 550);

        System.out.println("Mysak");
        morce1.popcorning();
        morce1.piskani();
        morce1.zrani();

        System.out.println("Pipikos");
        morce2.popcorning();
        morce2.piskani();
        morce2.zrani();



    }
}
