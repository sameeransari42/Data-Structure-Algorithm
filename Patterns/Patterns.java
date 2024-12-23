package Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();



        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                ++k;
                System.out.print(k  + " ");
            }
            System.out.println();

        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r-i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= r; i++) {
            for (int j = i; j >= 1 ; j--) {
                if (j % 2 != 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            for (int j = c; j > 1 + i; j--) {
                System.out.print("  ");
            }

            for (int l = 1; l <= i + 1; l++){
                System.out.print("* ");
            }

            System.out.println();
        }

        int s = 1;
        int e = r;
        for (int i = 1; i <= r; i++) {
            if (i == s || i == e){
                for (int j = 1; j <= c; j++) {
                    System.out.print("* ");
                }
            }else {
                for (int j = 1; j <= c; j++) {
                    if (j == s || j == c) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
