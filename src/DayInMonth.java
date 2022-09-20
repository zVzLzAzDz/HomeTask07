import java.util.Scanner;

public class DayInMonth {

    public static int determineTheNumberOfDays(int months, int years) {

        Scanner input = new Scanner(System.in);

        int daysInMonth = 0;

        String monthInYears = "";


        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        month = month < 0 ? -month : month;
        year = year < 0 ? -year : year;

        switch (month) {
            case 1:
                monthInYears = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthInYears = "February";
                daysInMonth = 28;
                break;
            case 3:
                monthInYears = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthInYears = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthInYears = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthInYears = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthInYears = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthInYears = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthInYears = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthInYears = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthInYears = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthInYears = "December";
                daysInMonth = 31;
        }

        if (year > 2022 || month > 12) {
            System.out.println("The data does not lie in the specified range!!!");
        } else {
            System.out.print(monthInYears + " " + year + " has " + daysInMonth + " days");
        }

        return daysInMonth;
    }

    public static void main(String[] strings) {

        int result = determineTheNumberOfDays( 0,  0);
    }
}