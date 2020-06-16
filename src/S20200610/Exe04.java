package S20200610;

public class Exe04 {

    public static void main(String[] args) {
        System.out.format("%,d\n", fact1(10));
        System.out.format("%,d\n", fact2(10));
    }

    public static int fact1(int n) {
        int acc = 1;
        int f = 2;
        while (f <= n) {
            acc *= f;
            ++f;
        }
        return acc;
    }

    public static int fact2(int n) {
        int acc = 1;
        for(int f = 2; f <= n; ++f) {
            acc *= f;
        }
         return acc;
    }
}
