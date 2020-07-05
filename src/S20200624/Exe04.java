package S20200624;

public class Exe04 {

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 7, 9, 0, -1};

        int x = 7;
        System.out.format("%d, %d\n", whereIs1(x, arr), whereIs2(x, arr));
//        System.out.println(whereIs1(x, arr) + ", " + whereIs2(x, arr));
    }

    public static int whereIs1(int key, int[] arr) {
        int where = -1;
        for (int i = 0; i < arr.length && where == -1; ++i) {
            if (arr[i] == key) {
                where = i;
            }
        }
        return where;
    }

    public static int whereIs2(int key, int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
