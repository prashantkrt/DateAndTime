import java.time.LocalDateTime;
//Represents date and time without zone
public class Learn3_LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //2024-04-17T17:01:32.316712
        LocalDateTime localDateTime = LocalDateTime.of(23, 12, 20, 20, 45);
        System.out.println(localDateTime);

        LocalDateTime minus = localDateTime.minusDays(1);
        System.out.println(minus);
        if (minus.isBefore(now)) {
            System.out.println("correct");
        }
    }
}
