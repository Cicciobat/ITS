/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

package Array_Arraylist;

import java.util.*;

public class mediaValori_list {

    public static Integer mediaValori(ArrayList<Integer> array){
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum / array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(4);
        arr.add(4);
        arr.add(4);

        System.out.println(mediaValori(arr));

    }
}
