package Bai3;

import java.util.Scanner;

public class ex1_intu_a_den_b {
    public static void main(String[] args) {
        System.out.println("nhap a:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("nhap a:");
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
