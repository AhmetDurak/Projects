package Training1;

import java.util.Date;

public class PrintFormat {
    public static void main(String[] args) {
        System.out.printf("%-30s %d %n","Volvo ist meine gebliebtes Auto", 340);
        System.out.printf("%c%n", 'a');
        System.out.printf("%23.2f%n", 23.234);

        Date date = new Date();

        System.out.println(date);

        System.out.printf("%tT%n",date);

        System.out.printf("Uhr ist: %tH%nMinute ist : %tM%nSecunde ist : %tS %n%1$tz", date, date, date,date);

        System.out.println("\n");
    }
}
