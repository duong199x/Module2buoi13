package Bai9;

public class ex1_chiatien {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        int count = 0;
        for (i = 0; i < 20; ++i) {
            for (j = 0; j < 10; ++j) {
                for (k = 0; k < 4; ++k) {
                    if (i * 1000 + j * 2000 + k * 5000 == 20000) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
