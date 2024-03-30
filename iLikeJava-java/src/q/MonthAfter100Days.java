package q;

import java.time.LocalDate;
import java.time.Month;

public class MonthAfter100Days {

    public static void main(String[] args) {
        // Get today's date (March 23)
        LocalDate today = LocalDate.of(2023, Month.MARCH, 23); // Replace 2023 with the current year if needed

        // Calculate the date 100 days from today
        LocalDate dateAfter100Days = today.plusDays(100);

        // Get the month of the calculated date
        Month month = dateAfter100Days.getMonth();

        // Print the result
        System.out.println("100 days from today (March 23) will be: " + month);
    }
}
