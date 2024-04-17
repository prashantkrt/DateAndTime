import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Learn4_ZonedDateTimeDemo {
    //Represents a date and time with time zone
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();//2024-04-17T17:13:24.141204+05:30[Asia/Kolkata]
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now2);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2002, 12, 14, 23, 34, 23, 10234, ZoneId.of("Asia/Kolkata"));
        System.out.println(zonedDateTime);

        ZonedDateTime zdt = ZonedDateTime.parse("2002-12-14T23:34:23Z");
        System.out.println(zdt);//2002-12-14T23:34:23Z

        ZonedDateTime zdt1 = ZonedDateTime.parse("2024-04-17T17:13:24.141204+05:30[Asia/Kolkata]");
        System.out.println(zdt1);
    }
}
