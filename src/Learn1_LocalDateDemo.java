import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Learn1_LocalDateDemo {
    // LocalDate : Represents the time without the time zone
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // current date 2024-04-17 YYYY-MM-dd
        System.out.println(now);
        LocalDate myDate = LocalDate.of(2020, 1, 14);
        System.out.println(myDate);

        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonth());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());

        System.out.println(now);
        System.out.println(now.minusMonths(100));

        LocalDate date1 = LocalDate.parse("2020-01-14");
        System.out.println(date1);

        LocalDate date = LocalDate.parse("2017-02-03");
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = formatter.format(date);
        System.out.println(format); // 03/02/2017

        LocalDate parse = LocalDate.parse(format, formatter);
        System.out.println(parse);


        String dateString = "17/04/2024";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateString, formatter1);
        System.out.println("LocalDate: " + localDate);

        LocalDate Date4 = LocalDate.parse("2017-02-03");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format2 = formatter2.format(Date4);
        System.out.println(format2);
        //again making it back to LocalDate
        LocalDate localDate2 = LocalDate.parse(format2, formatter2);
        System.out.println(localDate2);

        LocalDate yesterday = LocalDate.now().minusDays(1);

        if (now.isAfter(yesterday)) {
            System.out.println("yesterday");
        }
    }
}