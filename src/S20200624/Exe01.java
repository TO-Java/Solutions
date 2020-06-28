package S20200624;

public class Exe01 {
    public static void main(String[] args) {
        int[] arr = {3, -222, 9, 6, 8};
        printReverse(arr);
    }

    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.print("(" + arr[i] + ")");
        }
        System.out.println();
    }

//    public static int product(int [] arr) {
//
//    }
}
