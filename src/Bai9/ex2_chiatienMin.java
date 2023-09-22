package Bai9;

import java.util.ArrayList;

public class ex2_chiatienMin {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        for (i = 0; i < 20; ++i) {
            for (j = 0; j < 10; ++j) {
                for (k = 0; k < 4; ++k) {
                    if (i * 1000 + j * 2000 + k * 5000 == 20000 && i!=0 && j!=0 && k!=0) {
                        System.out.println("i " + i + ",j " + j + ",k " + k);
                    }
                }
            }
        }

    }

}
