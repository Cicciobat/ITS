/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.compito20_03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {
    public static double main(int[] x) {
        ArrayList<Integer> myArray = new ArrayList<>();
        double sum = 0;
        int tempValue;
        for (int i = 0; i < x.length; i++) {

            tempValue = x[i];

            if (tempValue % 2 == 0) {
                myArray.add(tempValue);
                sum += tempValue;
            }
        }
        System.out.println("I soli numeri pari inseriti sono: " + myArray);
        return (sum / (myArray.size()));
    }

    public static void main(String args[]) {

        int[] V = new int[4];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Questo programma calcola la media di 4 numeri.");

        for (int i = 0; i < V.length; i++) {
            System.out.println("Inserisci un numero: ");
            int a;
            a = sc.nextInt();
            sum += V[i] = a;
        }

        System.out.println("Hai inserito i seguenti numeri: " + Arrays.toString(V) +
                " e la loro somma e': " + sum);
        System.out.println("La media dei numeri pari inseriti e': " + main(V));
    }
}
