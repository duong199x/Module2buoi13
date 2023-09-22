package Bai6;

import java.util.Scanner;

public class ex1_boiuoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("ước của a");
        for (int i = 1; i <= a; i++) { /// 1
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("bội của a nhỏ hơn 100");
        for (int i = 100; i >= a; i--) {
            if (i % a == 0) {
                System.out.println(i);
            }
        }
    }
}
