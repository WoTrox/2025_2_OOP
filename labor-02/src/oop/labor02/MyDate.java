package oop.labor02;

public class MyDate {
    int year = 0;
    int month = 0;
    int day = 0;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }
}
