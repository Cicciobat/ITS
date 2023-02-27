package Array_Arraylist;

public class findPari_list {

    public static void findP(int[] array){
        for (int i = 0; i < array.length; i++) {
           if (array[i] % 2 == 0){
               System.out.println(array[i]);
           }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        findP(arr);
    }
}
