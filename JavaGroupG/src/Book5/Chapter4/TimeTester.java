package Book5.Chapter4;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;
public class TimeTester
{
    public static void main(String[] args)
    {
//        System.out.println("\nLocalTime: " + LocalTime.now().toString());
//        System.out.println("\nLocalDateTime: " + LocalDateTime.now().toString());
//        System.out.println("\nZonedDateTime: " + ZonedDateTime.now().toString());
//        System.out.println("\nOffsetTime: " + OffsetTime.now().toString());
//        System.out.println("\nOffsetDateTime: " + OffsetDateTime.now().toString());
//        System.out.println("\nMonthDay: " + MonthDay.now().toString());
//        System.out.println("\nYearMonth: " + YearMonth.now().toString());
//        System.out.println("\nInstant: " + Instant.now().toString());
        //      Using the parse method to create a date time object
        LocalDate d = LocalDate.parse(2014,12,);
        System.out.println(d + "\n");

        try {
            LocalDateTime ldt = LocalDateTime.parse("2014-12-15T15:45");
            System.out.println(ldt);
        } catch (DateTimeParseException e) {

            System.out.println(e.getLocalizedMessage());
        }

    }
}
