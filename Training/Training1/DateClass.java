package Training1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {

        Date date = new java.util.Date();
        LocalDateTime localDateTime = LocalDateTime.now();


        System.out.println("Before formatting: " +date);

        //while (true){
        //    try{
        //        System.out.printf("%1$tH:%1$tM:%1$tS%1$n", new java.util.Date());
        //        TimeUnit.MILLISECONDS.sleep(1000);
        //    }catch (InterruptedException ignored){}
        //}


        String myTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy\nHH:mm:ss"));
        System.out.println("After formatting: \n" + myTime);

    }
}