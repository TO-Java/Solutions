package S20200610;

public class Exe05 {

    public static void main(String[] args) {
        System.out.println(daysOfMonth(2003, 7));
    }

    public static int daysOfMonth(int year, int month) {
        int days;
        if (month == 2) {
            days = 28;
            if (year % 4 == 0) {
                days = 29;
                if (year % 100 == 0) {
                    days = 28;
                    if (year % 400 == 0) {
                        days = 29;
                    }
                }
            }
        } else {
            days = 31;
            if (month < 7 && month % 2 == 0 || month > 8 && month % 2 != 0) {
                days = 30;
            }
        }
        return days;
    }
}
