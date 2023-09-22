package Bai7;

import java.util.Scanner;

public class ex1_docso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0 && number <= 10) {
            motchuso(number);
        }
        if (number == 10) {
            System.out.println("muoi");
        }
        if (number > 10 && number < 100) {
            haichuso(number);
        }
        if (number == 100) {
            System.out.println("Một trăm");
        }
        if (number > 100 && number < 1000) {
            bachuso(number);
        }
    }

    public static void motchuso(int n) {
        switch (n) {
            case 0:
                System.out.println("Khong");
                break;

            case 1:
                System.out.println("Mot");
                break;

            case 2:
                System.out.println("Hai");
                break;

            case 3:
                System.out.println("Ba");
                break;

            case 4:
                System.out.println("Bon");
                break;

            case 5:
                System.out.println("Nam");
                break;

            case 6:
                System.out.println("Sau");
                break;

            case 7:
                System.out.println("Bay");
                break;

            case 8:
                System.out.println("Tam");
                break;

            case 9:
                System.out.println("Chin");
                break;
        }
    }

    public static void haichuso(int n) {
        int mot = n / 10;
        int hai = n % 10;
        switch (mot) {
            case 1:
                System.out.print("Mười ");
                break;

            case 2:
                System.out.print("Hai mươi ");
                break;

            case 3:
                System.out.print("Ba mươi ");
                break;

            case 4:
                System.out.print("Bon mươi ");
                break;

            case 5:
                System.out.print("Nam mươi ");
                break;

            case 6:
                System.out.print("Sau mươi ");
                break;

            case 7:
                System.out.print("Bay mươi ");
                break;

            case 8:
                System.out.print("Tam mươi ");
                break;

            case 9:
                System.out.print("Chin mươi ");
                break;
        }
        switch (hai) {

            case 0:
                System.out.print("muoi");
                break;

            case 1:
                System.out.print("mot");
                break;

            case 2:
                System.out.print("hai");
                break;

            case 3:
                System.out.print("ba");
                break;

            case 4:
                System.out.print("bon");
                break;

            case 5:
                System.out.print("nam");
                break;

            case 6:
                System.out.print("sau");
                break;

            case 7:
                System.out.println("bay");
                break;

            case 8:
                System.out.println("tam");
                break;

            case 9:
                System.out.println("chin");
                break;
        }
    }

    public static void bachuso(int n) {
        int mot = n / 100;
        int hai = (n / 10) % 10;
        int ba = n % 10;
        switch (mot) {
            case 1:
                System.out.print("Một trăm ");
                break;
            case 2:
                System.out.print("Hai trăm ");
                break;
            case 3:
                System.out.print("Ba trăm ");
                break;
            case 4:
                System.out.print("Bốn trăm ");
                break;
            case 5:
                System.out.print("Năm trăm ");
                break;
            case 6:
                System.out.print("Sáu trăm ");
                break;
            case 7:
                System.out.print("Bảy trăm ");
                break;
            case 8:
                System.out.print("Tám trăm ");
                break;
            case 9:
                System.out.print("Chín trăm ");
                break;
        }
        switch (hai) {
            case 0:
                System.out.print("linh ");
                break;
            case 1:
                System.out.print("mười ");
                break;

            case 2:
                System.out.print("Hai mươi ");
                break;

            case 3:
                System.out.print("Ba mươi ");
                break;

            case 4:
                System.out.print("Bon mươi ");
                break;

            case 5:
                System.out.print("Nam mươi ");
                break;

            case 6:
                System.out.print("Sau mươi ");
                break;

            case 7:
                System.out.print("Bay mươi ");
                break;

            case 8:
                System.out.print("Tam mươi ");
                break;

            case 9:
                System.out.print("Chin mươi ");
                break;
        }
        switch (ba) {
            case 0:
                System.out.print("muoi");
                break;

            case 1:
                System.out.print("mot");
                break;

            case 2:
                System.out.print("hai");
                break;

            case 3:
                System.out.print("ba");
                break;

            case 4:
                System.out.print("bon");
                break;

            case 5:
                System.out.print("nam");
                break;

            case 6:
                System.out.print("sau");
                break;

            case 7:
                System.out.println("bay");
                break;

            case 8:
                System.out.println("tam");
                break;

            case 9:
                System.out.println("chin");
                break;
        }
    }
}

