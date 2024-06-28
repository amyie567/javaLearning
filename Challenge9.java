import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Challenge9 {
    public static String findDay(int month , int day, int year){
        // Convert the string inputs to integers
        int d = day;
        int m = month;
        int y = year;

        // Create a Calendar object with the given date
        Calendar calendar = new GregorianCalendar(y, m - 1, d);

        // Array of days in a week
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        // Return the day of the week
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];

    }
    public static void main(String[] args) {
        // Sample input

        Scanner sc=new Scanner(System.in);

//
//        String day =sc.nextLine();
//        String month = sc.nextLine();
//
//        String year = sc.nextLine();
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();

        // Output the day of the week
        System.out.println(findDay(day, month, year));






    }
}


