package S20200617;

public class Exe02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + ": " + harmonicSequence1(10, 2, i) + ", " + harmonicSequence2(10, 2, i));
        }
    }

    public static double harmonicSequence1(int a, int d, int n) {
        return 1.0 / (a + (n - 1) * d);
    }

    public static double harmonicSequence2(int a, int d, int n) {
        int denominator = a;
        int i = 1;
        while (i < n) {
            denominator += d;
            ++i;
        }
        return 1.0 / denominator;

    }
}
