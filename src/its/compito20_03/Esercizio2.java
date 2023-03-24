/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.compito20_03;import java.util.Arrays;
import java.util.Scanner;

public class Esercizio2 {

    public static void main(String args[]) {

        int[] V = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Questo programma calcola il minore ed il maggiore di 5 numeri " +
                "inseriti.");

        for (int i = 0; i < V.length; i++) {
            System.out.println("Inserisci un numero: ");
            int a;
            a = sc.nextInt();
            sum += V[i] = a;
        }

        Arrays.sort(V);

        int minValue = V[0];
        int maxValue = V[4];

        System.out.println("Hai inserito i seguenti numeri: " + Arrays.toString(V));
        System.out.println("Il valore minimo inserito e': " + minValue + ". " +
                "Il valore massimo inserito e': " + maxValue + ".");
    }
}
