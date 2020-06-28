package S20200621;

public class Ex01 {

    public static void main(String[] args) {
        int n = 5;
        System.out.format("%d, %d, %d\n", pow3_1(n), pow3_2(n), pow3_3(n));
    }

    public static int pow3_1(int n) {
        return (int) Math.pow(n, 3);
    }

    public static int pow3_2(int n) {
        return n * n * n;
    }

    public static int pow3_3(int n) {
        int acc = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 1; k <= n; ++k) {
                    ++acc;
                }
            }
        }
        return acc;
    }
}
