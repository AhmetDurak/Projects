package Others;

public class DayAndNight {
    public static void main(String[] args) {
        System.out.println(new DayAndNight().calculate(2592000));

    }

    String calculate(int input) {
        int year   = 3600 * 24 * 30 * 365;
        int month  = 3600 * 24 * 30;
        int day    = 3600 * 24;
        int hour   = 3600;
        int minute = 60;
        int second = 0;
        int year2  = 0,month2= 0,day2= 0,hour2= 0,minute2= 0;

        if (input > 0) {
            if ((input / year > 0)) {      //calculate year
                year2 = input / year;
                input -= year * year2;
            }
            if ((input / month > 0)) {      //calculate month
                month2 = input / month;
                input -= month * month2;
            }
            if ((input / day > 0)) {      //calculate day
                day2 = input / day;
                input -= day * day2;
            }
            if ((input / hour > 0)) {      //calculate hour
                hour2 = input / hour;
                input -= hour * hour2;
            }
            if ((input / minute > 0)) {      //calculate minute
                minute2 = input / minute;
                input -= minute * minute2;
            } second = input;
        } else return second + "second";
        return year2 + " year " + month2 + " month " + day2 + " day " + hour2 + " hour " + minute2 + " minute " + second + " second";
    }
}
