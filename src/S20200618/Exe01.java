package S20200618;

public class Exe01 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + ": " + triangularNumbers(i));
        }
    }

    public static int triangularNumbers(int n) {
        int acc = 0;
        for (int x = 1; x <= n; ++x) {
            acc += x;
        }
        return acc;
    }
}
