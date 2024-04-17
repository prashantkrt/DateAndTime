import java.time.LocalDate;
import java.time.Period;

public class Learn7_PeriodDemo {
    //Represents periods between two dates
    public static void main(String[] args) {

        LocalDate end = LocalDate.now();
        LocalDate start = LocalDate.of(2002,1,13);

        Period between = Period.between(start, end);
        System.out.println(between);

        int days = between.getDays();
        int months = between.getMonths();
        int years = between.getYears();
        System.out.println(days);
        System.out.println(months);
        System.out.println(years);

        Period period = Period.of(2000,1,1);
        System.out.println(period);
    }
}
