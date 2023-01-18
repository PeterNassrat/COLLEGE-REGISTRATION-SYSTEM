package ToolsPackage;

import java.time.YearMonth;
import java.util.Scanner;

public class Date_of_Birth {

    private int Day;
    private int Month;
    private int Year;

    public Date_of_Birth(Scanner Sc) {
        this.setDate_of_Birth(Sc);
    }

    public final void setDate_of_Birth(Scanner Sc) {
        System.out.printf("Enter Date of Birth: \nDay: ");
        int day = Sc.nextInt();
        System.out.printf("Month: ");
        int month = Sc.nextInt();
        System.out.printf("Year: ");
        int year = Sc.nextInt();
        while (!(this.isValidDate_of_Birth(day, month, year))) {
            System.out.printf("Invalid Date of Birth!\n");
            System.out.printf("Enter Date of Birth again: \nDay: ");
            day = Sc.nextInt();
            System.out.printf("Month: ");
            month = Sc.nextInt();
            System.out.printf("Year: ");
            year = Sc.nextInt();
        }
        Day = day;
        Month = month;
        Year = year;
    }

    public boolean isValidDate_of_Birth(int Day, int Month, int Year) {
        boolean isValid = false;
        if (isValidDate(Day, Month, Year) == true) {
            if (getAge(Year) >= 17 && getAge(Year) <= 75) {
                isValid = true;
            }
        }
        return isValid;
    }

    public boolean isValidDate(int Day, int Month, int Year) {
        boolean isValid = false;
        if (Year > 0) {
            if (Month > 0 && Month < 13) {
                int[] Day_of_Month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
                    Day_of_Month[2] = 29;
                }
                if (Day > 0 && Day <= Day_of_Month[Month]) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    public int getAge() {
        return YearMonth.now().getYear() - Year;
    }

    public int getAge(int Year) {
        return YearMonth.now().getYear() - Year;
    }

    public int getYear() {
        return Year;
    }

    public int getMonth() {
        return Month;
    }

    public int getDay() {
        return Day;
    }
}
