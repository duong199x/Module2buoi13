package Bai3;

import java.util.Scanner;

public class ex3_sochinhphuong {
    public static void main(String[] args) {
        System.out.println("nhap a:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double n = Math.sqrt(a);
        if (Math.ceil(n) != Math.floor(n)) {
            System.out.println("không là số chính phương");
        } else {
            System.out.println("là số chính phương");
        }
    }
}
