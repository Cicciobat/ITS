/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

import java.util.*;

public class Binary {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void findBinary(int x){
        int bin;

        while (x != 0){
            bin = x % 2;
            arr.add(bin);
            x /= 2;
        }
        Collections.reverse(arr);

        for (Integer i: arr) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il numero che desideri convertire in binario: ");
        a = sc.nextInt();

        System.out.print("Il numero in binario è: ");
        findBinary(a);
    }
}
