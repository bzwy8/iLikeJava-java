package q;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekAfter100Days {

    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the date 100 days from today
        LocalDate dateAfter100Days = today.plusDays(100);

        // Get the day of the week for the calculated date
        DayOfWeek dayOfWeek = dateAfter100Days.getDayOfWeek();

        // Print the result
        System.out.println("100 days from today (Tuesday) is: " + dayOfWeek);
    }
}
