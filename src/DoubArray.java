/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

public class DoubArray {
    public static void main(String[] args) {

        int sample[] []= new int [7] [4]; // Primo valore colonne, secondo valore righe. 8 per fare sample[j][i] = (i * 7) + j;
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 7; j++) {
                sample[j][i] = (i * 7) + j + 1;
                System.out.print(sample[j] [i] + "\t");
            }
            System.out.println();
        }
    }
}
