package Array_Arraylist;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
