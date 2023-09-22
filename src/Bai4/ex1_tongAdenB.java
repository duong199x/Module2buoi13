package Bai4;

import java.util.Scanner;

public class ex1_tongAdenB {
    public static void main(String[] args) {
        System.out.println("nhap a:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("nhap a:");
        int b = input.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
