package Array_Arraylist;

import java.util.*;

public class eliminaDuplicati_list {

    public static ArrayList<Integer> delete(ArrayList<Integer> array){


        ArrayList<Integer> array1 = new ArrayList<>();

        for (Integer n: array) {
            if (!array1.contains(n)){
                array1.add(n);
            }
        }
        return array1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.size());

        System.out.println("L'ArrayList è: " + arr);

        ArrayList<Integer> newArr = delete(arr);

        System.out.println("L'ArrayList senza duplicati è: " + newArr);

    }
}
