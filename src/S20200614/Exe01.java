package S20200614;

public class Exe01 {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            System.out.println(arithmeticSequence(10, 2, i));
        }
    }

    public static int arithmeticSequence(int a, int d, int n) {
        int acc = a;
        int i = 1;
        while (i < n) {
            acc += d;
            ++i;
        }
        return acc;
    }
}
