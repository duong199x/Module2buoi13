package Bai8;

public class ex1_tong3songuyen {
    public static void main(String[] args) {
        System.out.println(tong3so(2, 2));
    }

    public static int tong3so(int N, int S) {
        int dem = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    if (i + j + k == S) {
                        dem++;
                    }
                }
            }
        }
        return dem;
    }
}
