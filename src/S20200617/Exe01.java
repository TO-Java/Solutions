package S20200617;

public class Exe01 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            System.out.println(geometricSequence(10, 2, i));
        }
    }

    public static int geometricSequence(int a, int r, int n) {
        int acc = a;
        int i = 1;
        while(i < n) {
            acc *= r;
            ++i;
        }
        return acc;
    }
}
