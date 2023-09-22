package Bai3;

import java.util.Scanner;

public class ex2_fizz_buzz {
    public static void main(String[] args) {
        System.out.println("nhap a:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (a % 3 == 0) {
            System.out.println("fizz");
        } else if (a % 5 == 0) {
            System.out.println("buzz");
        }

    }
}
