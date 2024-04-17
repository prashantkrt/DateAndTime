import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//formats & parses  date and time
public class Learn8_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //LocalDate to the format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(localDateTime);
        System.out.println(formattedDate);

        //converting back to LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(formattedDate, formatter2);
        System.out.println(localDateTime1);

        String myDate = "2012-03-15";
        LocalDate localDate = LocalDate.parse(myDate);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ans = formatter3.format(localDate);
        System.out.println(ans);

        StringBuilder sb = new StringBuilder(ans);
        LocalDate localDate2 = LocalDate.parse(ans.toString(), formatter3);
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String ans2 = formatter5.format(localDate2);
        System.out.println(ans2);

        // also we can do this way
        LocalDate date22 = LocalDate.now();
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ans3 = formatter6.format(date22);
        // or either way is correct
        String ans4 = date22.format(formatter6);
        System.out.println(ans3 + " " + ans4);

        // convert the string to localDate
        String dateNew = "25/04/2023";
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateNew1 = LocalDate.parse(dateNew, formatter7);


        // convert the below String
        String dateStringFormat = "2023-04-24 10:30:45 IST";
        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        LocalDate local = LocalDate.parse(dateStringFormat, formatter8);
        System.out.println(local);

        //convert same to LocalDateTime
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateStringFormat, formatter8);
        System.out.println(localDateTime3);

        //convert same to ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateStringFormat, formatter8);
        System.out.println(zonedDateTime);

        // better give offset
        String dateStringFormatOffset = "2023-04-24 10:30:45+05:30";
        DateTimeFormatter formatter9 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        LocalDateTime local2 = LocalDateTime.parse(dateStringFormatOffset, formatter9);
        System.out.println(local2);

    }
}
