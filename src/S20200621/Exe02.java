package S20200621;

public class Exe02 {
    public static void main(String[] args) {
        int n = 10;
        System.out.format("%d, %d\n", fib1(n), fib2(n));
    }

    // <nth term> = 1/sr(5) * (((1+sr(5))/2)^n - ((1-sr(5))/2)^n)
    public static int fib1(int n) {
        return (int) (1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)));
    }

    public static int fib2(int n) {
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; ++i) {
            int t = prev;
            prev = curr;
            curr += t;
        }
        return curr;
    }
}
