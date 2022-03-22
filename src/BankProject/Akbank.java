package BankProject;

import java.io.IOException;

public class Akbank extends Bank {

    Akbank(String name) throws IOException {
        String AccType = "FinalBalance";
        double balance = 0;
        this.accountHolder = name;
        this.welcomeMoney = 0;
        this.depositCondition = 2000;
        this.withdrawCondition = 1000;
        specsAkbank(AccType);
        balance(balance, depositCondition);
    }               // When the main account is created

    Akbank(String AccType, double balance, String name, String[] log) throws IOException {     // When other accounts are created
        this.log = log;
        this.accountHolder = name;
        this.depositCondition = 2000;
        this.withdrawCondition = 1000;
        specsAkbank(AccType);
        balance(balance + this.welcomeMoney, depositCondition);
    }

    void specsAkbank(String AccType) {
        switch (AccType) {
            case "GOLD": {
                depositReturnValue = 80;
                withdrawExpenseValue = 70;
                returnRate = 1.3;
                accountType = "GOLD";
                this.log[0] = "1";                      // if gold account is created
                break;
            }
            case "SAVING": {
                depositReturnValue = 90;
                withdrawExpenseValue = 60;
                returnRate = 1.2;
                accountType = "SAVING";
                this.log[1] = "1";                      // if saving account is created
                break;
            }
            case "INTEREST": {
                depositReturnValue = 100;
                withdrawExpenseValue = 50;
                returnRate = 1.1;
                accountType = "INTEREST";
                this.log[2] = "1";                      // if interest account is created
                break;
            }
            case "FinalBalance": {
                depositReturnValue = 0;
                withdrawExpenseValue = 0;
                returnRate = 1;
                accountType = "FinalBalance";
                break;
            }

            default:
                System.out.println("Please enter a valid account type: ");
                specsAkbank(scanner.nextLine());
        }
    }
}
