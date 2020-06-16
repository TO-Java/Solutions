package S20200610;

public class Exe02 {

    public static void main(String[] args) {

        double doubleVar = 1.5;
        System.out.println(doubleVar);
        int intVar = (int) doubleVar;
        System.out.println(intVar);

        char charVar = 'a';
        System.out.println(charVar);
        float floatVar = (float) charVar;
        System.out.println(floatVar);

        long longVar = 10000L;
        System.out.println(longVar);
        charVar = (char) longVar;
        System.out.println(charVar);

    }
}
