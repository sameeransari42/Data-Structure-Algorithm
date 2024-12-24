package Arrays;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        //Note: Hey, Sameer please reduce this
        int[] arr = {1, 2, 3, 4, 5, 6};
        int idx = 4;

        int k = 0;
        int l = arr.length-1;

        int i = 0;
        int j = arr.length-idx -1;

        while (k <= l) {
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++; l--;
        }

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }

        int m = arr.length - idx;
        int n = arr.length-1;

        while (m <= n) {
            int temp = arr[m];
            arr[m] = arr[n];
            arr[n] = temp;
            m++; n--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
