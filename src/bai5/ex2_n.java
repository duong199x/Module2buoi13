package bai5;

import java.util.Scanner;

public class ex2_n {
    public static void main(String[] args) {
        System.out.println("nhap n:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum = 0;
        for (double i = 0; i < n; i++) {
            sum += ((2 * i + 1) / (2 * i + 2));
        }
        System.out.println(sum);
    }
}
