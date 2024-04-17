import java.time.LocalDate;
import java.time.LocalTime;

public class Learn2_LocalTimeDemo {
    //represents the time without date or time zone
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);//16:23:56.274120
        LocalTime localTime = LocalTime.of(23, 59, 59);//hh-mm-ss 23:59:59
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(23, 23);//hh-mm 23:23
        System.out.println(localTime1);

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        LocalTime time =LocalTime.parse("23:59:59");
        System.out.println(time);

        LocalTime before = LocalTime.now().minusHours(1);

        if (before.isBefore(now)) {
            System.out.println("correct!!!");
        }
    }
}
