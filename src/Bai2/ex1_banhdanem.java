package Bai2;

import java.util.Scanner;

public class ex1_banhdanem {
    public static void main(String[] args) {
        System.out.println("nhập số bánh đa nem");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = (double) a /9;
        System.out.println("số lần"+ Math.ceil(b));
    }
}
