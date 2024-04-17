import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
//Represents the instantaneous point on the timeline, typically used for machine timestamps
public class Learn5_InstantDemo {
    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        System.out.println(l);//epoch

        LocalTime time = LocalTime.now();
        System.out.println(time);
        Instant now = Instant.now(); // nano seconds
        System.out.println(now); // 2024-04-17T12:01:07.820274Z

        // 17:34:56.902344
        // 2024-04-17T12:04:56.902975Z
        System.out.println(Instant.now());
        System.out.println(now.toEpochMilli());
        System.out.println(now.getEpochSecond());

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
