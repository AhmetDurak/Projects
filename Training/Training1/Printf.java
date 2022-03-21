package Training1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Printf {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();

        System.out.printf("%tT%n", date);

        while(true){
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println();
            System.out.printf("Hour: %1$tH Minutes:  %1$tM Seconds: %1$tS",new Date());
        }
    }
}
