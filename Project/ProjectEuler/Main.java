package ProjectEuler;

public class Main {
    public static void main(String[] args) {

        thirdLetter();

    }

    public static void thirdLetter(){
        StringBuilder allLetter = new StringBuilder();

        int counter = 0;
        secondDecimal(allLetter, "", counter);
        allLetter.append("onehundred");
        secondDecimal(allLetter,"onehundredand" ,counter);
        allLetter.append("twohundred");
        secondDecimal(allLetter,"twohundredand" ,counter);
        allLetter.append("threehundred");
        secondDecimal(allLetter,"threehundredand" ,counter);
        allLetter.append("fourhundred");
        secondDecimal(allLetter,"fourhundredand" ,counter);
        allLetter.append("fivehundred");
        secondDecimal(allLetter,"fivehundredand" ,counter);
        allLetter.append("sixhundred");
        secondDecimal(allLetter,"sixhundredand" ,counter);
        allLetter.append("sevenhundred");
        secondDecimal(allLetter,"sevenhundredand" ,counter);
        allLetter.append("eighthundred");
        secondDecimal(allLetter,"eighthundredand" ,counter);
        allLetter.append("ninehundred");
        secondDecimal(allLetter,"ninehundredand" ,counter);
        allLetter.append("onethousand");


        System.out.println("allLetter = " + allLetter.length());
    }

    static void secondDecimal(StringBuilder allLetter, String hundredth, int counter) {


        firstTwoDecimal(allLetter, "",hundredth, counter);
        counter++;
        firstTwoDecimal(allLetter,"twenty",hundredth, counter);
        allLetter.append("thirty");
      firstTwoDecimal(allLetter,"thirty",hundredth, counter);
      allLetter.append("forty");
      firstTwoDecimal(allLetter,"forty",hundredth, counter);
      allLetter.append("fifty");
      firstTwoDecimal(allLetter,"fifty",hundredth, counter);
      allLetter.append("sixty");
      firstTwoDecimal(allLetter,"sixty",hundredth, counter);
      allLetter.append("seventy");
      firstTwoDecimal(allLetter,"seventy",hundredth, counter);
      allLetter.append("eighty");
      firstTwoDecimal(allLetter,"eighty",hundredth, counter);
      allLetter.append("ninety");
      firstTwoDecimal(allLetter,"ninety",hundredth, counter);

    }

    public static void firstTwoDecimal(StringBuilder allLetter, String tenth,String hundred, int counter) {

        allLetter.append(hundred).append(tenth).append("one");
        allLetter.append(hundred).append(tenth).append("two");
        allLetter.append(hundred).append(tenth).append("three");
        allLetter.append(hundred).append(tenth).append("four");
        allLetter.append(hundred).append(tenth).append("five");
        allLetter.append(hundred).append(tenth).append("six");
        allLetter.append(hundred).append(tenth).append("seven");
        allLetter.append(hundred).append(tenth).append("eight");
        allLetter.append(hundred).append(tenth).append("nine" );

        if (counter == 0) allLetter.append("ten");
        if (counter == 1) return;
        counter++;

        allLetter.append(hundred).append("eleven");
        allLetter.append(hundred).append("twelve");
        allLetter.append(hundred).append("thirteen");
        allLetter.append(hundred).append("fourteen");
        allLetter.append(hundred).append("fifteen");
        allLetter.append(hundred).append("sixteen");
        allLetter.append(hundred).append("seventeen");
        allLetter.append(hundred).append("eighteen");
        allLetter.append(hundred).append("nineteen");
    }
}