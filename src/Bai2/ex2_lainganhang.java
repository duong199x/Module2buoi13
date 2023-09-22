package Bai2;

import java.util.Scanner;

public class ex2_lainganhang {
    public static void main(String[] args) {
        System.out.println("nhap tien:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("nhap lai");
        int b = input.nextInt();
        System.out.println("lãi:" + (a + a * b / 100));
    }
}
