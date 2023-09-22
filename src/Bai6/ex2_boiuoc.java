package Bai6;

import java.util.Scanner;

public class ex2_boiuoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("ước số lẻ của a");
        int minMax = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && i % 2 != 0) {
                minMax = i;
            }
        }
        System.out.println(minMax);
        System.out.println("bội của a nhỏ");
    }
}
