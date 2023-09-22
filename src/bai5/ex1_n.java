package bai5;

import java.util.Scanner;

public class ex1_n {
    public static void main(String[] args) {
        System.out.println("nhap n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1);
        }
        System.out.println(sum);
    }
}
