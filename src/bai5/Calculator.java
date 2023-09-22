package bai5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 100;
        for (double i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / ((i + 1) * (i + 2));
        }
        System.out.println("tong" + sum);
    }
}
