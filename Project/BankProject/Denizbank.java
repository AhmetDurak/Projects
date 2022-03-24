package BankProject;

import java.io.IOException;

public class Denizbank extends Bank {

    Denizbank(String name) throws IOException {
        String AccType = "FinalBalance";
        double balance = 0;
        this.accountHolder = name;
        this.welcomeMoney = 0;
        this.depositCondition = 3000;
        this.withdrawCondition = 2000;
        specsAkbank(AccType);
        balance(balance, depositCondition);
    }               // When the main account is created

    Denizbank(String AccType, double balance, String name, String[] log) throws IOException {     // When other accounts are created
        this.log = log;
        this.accountHolder = name;
        this.depositCondition = 3000;
        this.withdrawCondition = 2000;
        specsAkbank(AccType);
        balance(balance + this.welcomeMoney, depositCondition);
    }

    void specsAkbank(String AccType) {
        switch (AccType) {
            case "GOLD": {
                depositReturnValue = 80;
                withdrawExpenseValue = 90;
                returnRate = 1.4;
                accountType = "GOLD";
                this.log[0] = "1";                      // if gold account is created
                break;
            }
            case "SAVING": {
                depositReturnValue = 100;
                withdrawExpenseValue = 70;
                returnRate = 1.1;
                accountType = "SAVING";
                this.log[1] = "1";                      // if saving account is created
                break;
            }
            case "INTEREST": {
                depositReturnValue = 90;
                withdrawExpenseValue = 80;
                returnRate = 1.2;
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
