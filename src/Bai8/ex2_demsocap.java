package Bai8;

public class ex2_demsocap {
    public static void main(String[] args) {
ghepcap(3,5);
    }

    public static void ghepcap(int nam, int nu) {
        int cap = Math.min(nam, nu);
        int LGBT = Math.abs(nam - nu) / 2;
        System.out.println(cap +","+ LGBT);
    }
}
