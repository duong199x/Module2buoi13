package Bai1;

import java.util.Scanner;

public class ex3_tamgiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập cạnh thứ 1:");
        int a = input.nextInt();
        System.out.println("nhập cạnh thứ 2:");
        int b = input.nextInt();
        System.out.println("nhập cạnh thứ 3:");
        int c = input.nextInt();
        if (((a + b) == c) || ((a + c) == b) || ((b + c) == a)) {
            System.out.println("không phải là tam giác");
        } else {
            if (a == b && b == c) {
                System.out.println("tam giác đều");
            }
            if (a == b || b == c || c == a) {
                System.out.println("tam giác cân");
            }
            if (a * a == (b + c) * (b + c) || b * b == (a + c) * (a + c) || c * c == (b + a) * (b + a)) {
                System.out.println("tam giác vuông");
            }
            if (a != b && a != c && b != c) {
                System.out.println("tam giác thường");
            }
        }


    }
}
