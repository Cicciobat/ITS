package Array_Arraylist;

import java.util.ArrayList;

public class findPari {

    public static ArrayList<Integer> findPari(ArrayList<Integer> array){

        ArrayList<Integer> array1 = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
           if (array.get(i) % 2 == 0){
               array1.add(i);
           }
        }

        return array1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        ArrayList<Integer> newArr = findPari(arr);

        System.out.println(newArr);
    }
}
