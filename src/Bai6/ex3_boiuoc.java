package Bai6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ex3_boiuoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhạp a");
        int a = input.nextInt();
        System.out.println("nhập b");
        int b = input.nextInt();
        System.out.println(ucln(a, b));
        System.out.println(bcnn(a, b));
//        ArrayList<Integer> uclnA = new ArrayList<>();
//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0) {
//                uclnA.add(i);
//            }
//        }
//        ArrayList<Integer> uclnB = new ArrayList<>();
//        for (int i = 1; i <= b; i++) {
//            if (b % i == 0) {
//                uclnB.add(i);
//            }
//        }
//        int max = 0;
//        for (int i = uclnA.size() - 1; i > 0; i--) {
//            if (uclnB.contains(uclnA.get(i))) {
//                max = uclnA.get(i);
//                break;
//            }
//        }
//        System.out.println(max);v

    }

    public static int ucln(int a, int b) {
        int ucln = 1;
        for (int i = 1; i < a && i < b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
        return ucln;
    }

    public static int bcnn(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }


}
