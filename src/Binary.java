/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

    static final int LENGHT = 31;
    static final int ARR_LENGHT = 32;

    public static int[] FindBinary(int x){
        int bin, i = LENGHT;
        int[] arr = new int[ARR_LENGHT];

        while (x != 0){
            bin = x % 2;
            arr[i]=bin;
            x /= 2;
            i--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il numero che desideri convertire in binario: ");
        a = sc.nextInt();

        System.out.print("Il numero in binario è: ");
        System.out.println(Arrays.toString(FindBinary(a)));
    }
}
