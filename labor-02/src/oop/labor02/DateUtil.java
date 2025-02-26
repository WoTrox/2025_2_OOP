package oop.labor02;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year <= 0 || month < 0 || month > 12 || day > 31 || day < 1) return false;
        int[] daysMax = {31, (isLeapYear(year)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day <= daysMax[month-1];
    }
}
