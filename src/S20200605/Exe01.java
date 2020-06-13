package S20200605;

import java.util.Scanner;

public class Exe01 {

    // Meaningful main
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 integers >> ");

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int t = smallest3(x, y, z);

        System.out.println("The smallest is: " + t);
    }

    /**
     * Returns the smallest between two numbers x and y
     * @param x The first number
     * @param y The second number
     * @return The smallest number between x and y
     */
     public static int smallest2(int x, int y) {
        int t = x;
        if (y < t) {
            t = y;
        }
        return t;
    }

    /**
     * Returns the smallest number between three numbers x, y and z
     * @param x The x number
     * @param y The y number
      * @param z The z number
     * @return The smallest between x, y and z
     */
    public static int smallest3(int x, int y, int z) {
        int t = smallest2(x, y);
        t = smallest2(t, z);
        return t;
    }
}
