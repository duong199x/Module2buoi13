package Bai1;

import java.util.Scanner;

public class ex2_max3so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số thứ 1:");
        int a = input.nextInt();
        System.out.println("nhập số thứ 2:");
        int b = input.nextInt();
        System.out.println("nhập số thứ 3:");
        int c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("max = " + a);
        } else if (b > c) {
            System.out.println("max = " + b);
        } else {
            System.out.println("max =" + c);
        }
    }
}
