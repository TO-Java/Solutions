package S20200610;

public class Exe03 {
    public static void main(String[] args) {
        System.out.format("%,.0f\n",C2F(30.5));
    }

    public static double C2F(double C) {
        return C * 9 / 5 + 32;
    }
}
