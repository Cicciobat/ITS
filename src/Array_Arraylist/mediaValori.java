package Array_Arraylist;

public class mediaValori {

    public static int mediaValori(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        System.out.println(mediaValori(arr));

    }
}
