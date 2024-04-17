import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//Duration between two points in time
public class Learn6_DurationDemo {
    public static void main(String[] args) {

        Instant start = Instant.now();
        System.out.println(start);

        for (int i = 0; i < 10000; i++) {
            if(i==1000)
                System.out.print("");
            // doing some work here !!!
        }

        Instant end = Instant.now();
        System.out.println(end);

        Duration between = Duration.between(start, end);
        System.out.println(between);

        long n = between.toMillis();
        System.out.println("millis->"+n);
        long m = between.toMinutes();
        System.out.println("minutes->"+m);
        long h = between.toHours();
        System.out.println("hours->"+h);
        long w = between.toDays();
        System.out.println("days->"+w);
        long nano = between.toNanos();
        System.out.println("nano->"+nano);
        long l = between.getSeconds();
        System.out.println("seconds->"+l);

        System.out.println("----------------------------");
        Duration duration = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(duration);
        Duration duration1 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration1);
        Duration duration2 = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(duration2);
        Duration duration3 = Duration.of(1, ChronoUnit.SECONDS);
        System.out.println(duration3);
        Duration duration4 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(duration4);


        LocalDateTime a = LocalDateTime.now();
        LocalDateTime b = LocalDateTime.now();
        Duration duration5 = Duration.between(a, b);
        System.out.println(duration5.getNano());
    }
}
