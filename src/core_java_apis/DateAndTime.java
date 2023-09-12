package core_java_apis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        /*** METHOD SIGNATURE
        public static LocalDate of(int year, int month, int dayOfMonth)
        public static LocalDate of(int year, Month month, int dayOfMonth)
        */

        LocalDate date1 = LocalDate.of(2023, Month.FEBRUARY, 23);
        LocalDate date2 = LocalDate.of(2023, 2, 23);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        /*** METHOD SIGNATURE
        public static LocalTime of(int hour, int minute)
        public static LocalTime of(int hour, int minute, int second)
        public static LocalTime of(int hour, int minute, int second, int nanos)
        */

        LocalDateTime dataTime1 = LocalDateTime.of(2023, Month.FEBRUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        /*** METHOD SIGNATURE
         public static LocalDateTime of(int year, int month,
         int dayOfMonth, int hour, int minute)
         public static LocalDateTime of(int year, int month,
         int dayOfMonth, int hour, int minute, int second)
         public static LocalDateTime of(int year, int month,
         int dayOfMonth, int hour, int minute, int second, int nanos)
         public static LocalDateTime of(int year, Month month,
         int dayOfMonth, int hour, int minute)
         public static LocalDateTime of(int year, Month month,
         int dayOfMonth, int hour, int minute, int second)
         public static LocalDateTime of(int year, Month month,
         int dayOfMonth, int hour, int minute, int second, int nanos)
         public static LocalDateTime of(LocalDate date, LocalTime)
        */


    }
}
