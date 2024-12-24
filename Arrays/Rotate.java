package Arrays;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        //Note: Hey, Sameer please reduce this
        int[] arr = {1, 2, 3, 4, 5, 6};
        int idx = 3;

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-idx-1);
        reverse(arr, arr.length-idx, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int a, int b) {
        while (a <= b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++; b--;
        }
    }
}
