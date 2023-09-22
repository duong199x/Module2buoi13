package Bai8;

public class ex3_banhchung {
    public static void main(String[] args) {
        chiaBanh(new int[]{3,3,2});
    }

    public static void chiaBanh(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("So banh:" + (int)Math.ceil(sum / 4));
    }
}
