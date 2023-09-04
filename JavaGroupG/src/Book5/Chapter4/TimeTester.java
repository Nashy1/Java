package Book5.Chapter4;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
//        LocalDate d = LocalDate.parse("2014-12-15");
//        System.out.println(d + "\n");
//
//        try {
//            LocalDateTime ldt = LocalDateTime.parse("2014-12-15T15:45");
//            System.out.println(ldt);
//        } catch (DateTimeParseException e) {
//
//            System.out.println(e.getLocalizedMessage());
//        }
//        LocalDate date = LocalDate.of(2014,Month.DECEMBER,15);
//        System.out.println(date);


//        for (String id: ZoneId.getAvailableZoneIds()){
//            System.out.println(id);
//        }

//        ZoneId z = ZoneId.of("America/Los_Angeles");
//        ZonedDateTime zdate= ZonedDateTime.of(2014,12,15,0,0,0,0, z);
////        ZonedDateTime zdate= ZonedDateTime.of(2014,12,15,0,0,0,0,  ZoneId.of("America/Los_Angeles"));
//        System.out.println(zdate);

//        ZoneOffset z = ZoneOffset.ofHours(-8);
//        OffsetTime time = OffsetTime.of(10,30,0,0,z);
//        System.out.println(time);

//        LocalDate date = LocalDate.now();
//        System.out.println(date.getYear());
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDayOfWeek());

//       if(LocalDate.now().equals( LocalDate.now())){
//           System.out.println("All is right in the universe.");
//       }else {
//           System.out.println("Something wrong in the universe.");
//       }

//        System.out.println("Today: " + LocalDate.now());
//        System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));
//        System.out.println("Next Week is: " + LocalDate.now().plusWeeks(1));
//        System.out.println("Next Month is: " + LocalDate.now().plusMonths(1));
//        System.out.println("Next Year is: " + LocalDate.now().plusYears(1));

//        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = LocalDate.parse("2024-09-02");
//        System.out.println(date1.until(date2, ChronoUnit.DAYS));
//        System.out.println(date1.until(date2, ChronoUnit.MONTHS));
//        System.out.println(date1.until(date2, ChronoUnit.YEARS));

//        LocalDate today = LocalDate.now();
//        LocalDate invDate = LocalDate.of(today.getYear(), today.getMonthValue(), 15);
//        if (today.getDayOfMonth() > 15){
//            invDate = invDate.plusMonths(1);}
//        long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
//        System.out.println(daysToInvoice + " until next invoice date.");


        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
        LocalDate date = LocalDate.now();
        System.out.println(date.format(formatter));


    }
}
