/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package its.compito20_03;import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Esercizio {

    public static String minValue(ArrayList<Integer> x){
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer i : x) {
            if (i % 2 == 1){
                temp.add(i);
            }
        }
        Collections.sort(temp);

        int minDispari = temp.get(0);

        return "Il numero dispari minore tra quelli inseriti e' : " + minDispari;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("Questo programma restituisce il numero dispari minore tra i numeri " +
                "inseriti.");
        System.out.println("Inserisci un numero: (Inserisci -1 per uscire.)");
        a = sc.nextInt();
        while (a != -1){
            myArrayList.add(a);
            System.out.println("Inserisci un altro numero: ");
            a = sc.nextInt();
        }

        Collections.sort(myArrayList);

        System.out.println("I numeri inseriti sono: " + myArrayList);
        System.out.println(minValue(myArrayList));

    }
}