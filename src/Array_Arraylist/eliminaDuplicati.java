package Array_Arraylist;

import java.util.Arrays;

public class eliminaDuplicati {

    public static void delete(int[] array){
        int  k = 0;
        int j;

        int[] array1 = new int [7];
        for (j = 0; j < array.length-1; j++) {
            if (array[j] != array[j+1]) {
                    array1[k++] = array[j];
            }
        }
        array1[k] = array[j];
        System.out.println("L'array senza duplicati e': " + Arrays.toString(array1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 6, 7};

        System.out.println(arr.length);

        System.out.println("L'array è: " + Arrays.toString(arr));
        delete(arr);

    }
}
