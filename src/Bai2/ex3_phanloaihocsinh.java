package Bai2;

import java.util.Scanner;

public class ex3_phanloaihocsinh {
    public static void main(String[] args) {
        System.out.println("nhap diem:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        if (a>=8){
            System.out.println("giỏi");
        }else if (a>=6 && a <8){
            System.out.println("khá");
        }else {
            System.out.println("tb");
        }
    }
}
