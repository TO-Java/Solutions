package S20200607;

public class Exe2 {

    public static void main(String[] args) {

        biggest1(5, 7);
        biggest2(5, 7);
        biggest3(5, 7);
    }

     public static void biggest1(int x, int y) {
        if(x > y) {
            System.out.println(x + ", " + y);
        }
        else {
            System.out.println(y + ", " + x);
        }
    }

    public static void biggest2(int x, int y) {
        int small = x, big = y;
        if(x > y) {
            small = y;
            big = x;
        }
        System.out.println(big + ", " + small);
    }

    public static void biggest3(int x, int y) {
        if(x < y) {
            int t = x;
            x = y;
            y = t;
        }
        System.out.println(x + ", " + y);
    }


}
