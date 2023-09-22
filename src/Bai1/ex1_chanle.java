package Bai1;

import java.util.Scanner;

public class ex1_chanle {
    public static void main(String[] args) {
        System.out.println("nhập n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("số chẵn");
        } else {
            System.out.println("số lẻ");
        }
    }
}