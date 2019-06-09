package Program;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(doesLeapYear(2012) ? "Leap Year" : "Not a Leap year");
        System.out.print(doesLeapYear(2000) ? "Leap Year" : "Not a Leap year");
    }

    private static boolean doesLeapYear(int year) {
        return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
    }
}
