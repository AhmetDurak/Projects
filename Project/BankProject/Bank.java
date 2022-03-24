package BankProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Denizbank> accountLog = new HashMap<>();
    ScanReader scanReader = new ScanReader(System.in);

    double goldWallet;
    double savingWallet;
    double interestWallet;
    double finalBalance;
    String accountType;
    double returnRate;
    double welcomeMoney;
    int depositReturnValue;
    double withdrawExpenseValue;
    int depositCondition;
    int withdrawCondition;
    boolean mainLog;
    String accountHolder;
    String[] log = {
            "0",     // GOLD
            "0",     // SAVING
            "0",     // INTEREST
            "",      // switchTo
            "",      // exit
    };

    void returnAllInfo() {
        System.out.println("Account holder: " + accountHolder.toUpperCase());
        for (String accounts : accountLog.keySet()) {
            switch (accountLog.get(accounts).accountType) {
                case "GOLD":
                    System.out.println("goldWallet = " + accountLog.get("GOLD").goldWallet);
                    break;
                case "SAVING":
                    System.out.println("savingWallet = " + accountLog.get("SAVING").savingWallet);
                    break;
                case "INTEREST":
                    System.out.println("interestWallet = " + accountLog.get("INTEREST").interestWallet);
                    break;
            }
        }
        System.out.println("finalBalance = " + this.finalBalance);

    }

    void balance(double balance, int depositCondition) throws IOException {
        switch (accountType) {
            case "GOLD":
                this.goldWallet += balance + (balance >= depositCondition ? depositReturnValue : 0);
                System.out.println("goldWallet = " + goldWallet);
                break;
            case "SAVING":
                this.savingWallet += balance + (balance >= depositCondition ? depositReturnValue : 0);
                System.out.println("savingWallet = " + savingWallet);
                break;
            case "INTEREST":
                this.interestWallet += balance + (balance >= depositCondition ? depositReturnValue : 0);
                System.out.println("interestWallet = " + interestWallet);
                break;
            case "FinalBalance":
                this.finalBalance += balance;
                System.out.println("FinalBalance = " + finalBalance);
                break;
        }

        menu(true);
    }

    void menu(boolean goOn) throws IOException {

        while (goOn) {
            if (this.log[4].equals("exit")) {
                this.log[4] = "";
                goOn = false;
                continue;
            }

            if (accountType.contains("FinalBalance")) {
                if (!accountLog.isEmpty()) {
                    switch (this.log[3]) {
                        case "GOLD":
                            switchAccount("1");
                            break;
                        case "SAVING":
                            switchAccount("2");
                            break;
                        case "INTEREST":
                            switchAccount("3");
                            break;
                    }
                }
                if (!this.log[3].isEmpty()) continue;
            }
            if (accountType.contains("FinalBalance")) {
                System.out.println();
                System.out.println("-------  MAIN ACCOUNT  --------");
                System.out.println("What would you like to do?\n" +
                        "1. Deposit     -   2. Withdraw\n" +
                        "3. Add account -   4. Close account\n" +
                        "5. Add final   -   6. Switch account\n" +
                        "7. All balance -   8. Exit");
            } else {
                System.out.println("-------  " + accountType.toUpperCase() + "  --------");
                System.out.println("What would you like to do?\n" +
                        "1. Deposit     -   2. Withdraw\n" +
                        "5. Add final   -   6. Switch account\n" +
                        "7. All balance -   8. Exit");
            }
            try {

                String inputMode = scanReader.scanString();

                if (inputMode.equals("1")) {                                                               // DEPOSIT
                    System.out.println("How much do you want to deposit: ");
                    deposit(scanReader.scanString());
                } else if (inputMode.equals("2")) {                                                        //WITHDRAW
                    System.out.println("How much do you want to withdraw: ");
                    withdraw(scanReader.scanString());
                } else if (inputMode.equals("3") && accountType.contains("FinalBalance")) {                //ADD ACCOUNT
                    showResult("Non-Existing Account");
                    addAccount(scanReader.scanString());
                } else if (inputMode.equals("4") && accountType.contains("FinalBalance")) {             //CLOSE ACCOUNT
                    System.out.println("Which account do you want to close?");
                    showResult("SubAccount");
                    System.out.println("4. Final Balance");
                    String value = scanReader.scanString();
                    if (value.equals("4")) closeMainAccount();
                    else closeAccount(value);
                } else if (inputMode.equals("5")) {                                                             //ADD FINAL
                    addFinal(scanReader.scanString());
                } else if (inputMode.equals("6")) {                                                             //SWITCH ACCOUNT
                    showResult("SubAccount");
                    switchAccount(scanReader.scanString());

                } else if (inputMode.equals("7")) {                                                           //RETURN ALL INFO
                    returnAllInfo();
                } else if (inputMode.equals("8")) {                                                             //EXIT
                    System.out.println("Are you sure?");
                    if (scanner.nextBoolean()) goOn = false;
                }
            } catch (NullPointerException e) {
                System.out.println("Wrong Input!!!");
            }
        }
    }

    void deposit(String balance1) {
        double balance = Integer.parseInt(balance1);
        switch (this.accountType.toLowerCase()) {
            case "gold":
                this.goldWallet += balance + (balance >= depositCondition ? depositReturnValue : 0);
                System.out.println(balance + " has been added to your balance.\nYour gold balance has " + goldWallet);
                break;
            case "saving":
                this.savingWallet += balance + (balance >= depositCondition ? depositReturnValue : 0);
                System.out.println(balance + " has been added to your balance.\nYour saving balance has " + savingWallet);
                break;
            case "interest":
                this.interestWallet += balance + (balance >= depositCondition ? depositReturnValue : 0);
                System.out.println(balance + " has been added to your balance.\nYour interest balance has " + interestWallet);
                break;
            case "finalbalance":
                this.finalBalance += balance;
                System.out.println(balance + " has been added to your balance.\nYour final balance has " + finalBalance);
                break;
        }
    }

    void withdraw(String balance1) {
        double balance = Integer.parseInt(balance1);
        switch (this.accountType.toLowerCase()) {
            case "gold":
                this.goldWallet -= balance - (balance >= withdrawCondition ? withdrawExpenseValue : 0);
                System.out.println(balance + " has been withdraw from your balance.\nYour gold balance has " + goldWallet);
                break;
            case "saving":
                this.savingWallet -= balance - (balance >= withdrawCondition ? withdrawExpenseValue : 0);
                System.out.println(balance + " has been withdraw from your balance.\nYour saving balance has " + savingWallet);
                break;
            case "interest":
                this.interestWallet -= balance - (balance >= withdrawCondition ? withdrawExpenseValue : 0);
                System.out.println(balance + " has been withdrawn from your balance.\nYour interest balance has " + interestWallet);
                break;
            case "finalbalance":
                this.finalBalance -= balance;
                System.out.println(balance + " has been withdrawn from your balance.\nYour final balance has " + finalBalance);
                break;
        }
    }

    void addFinal(String balance1) {
        double balance = Integer.parseInt(balance1);
        this.finalBalance += balance;
    }

    void closeAccount(String AccType) throws IOException {
        switch (AccType) {
            case "1":
                accountLog.get("GOLD").closeCurrentAccount();
                this.finalBalance += accountLog.get("GOLD").finalBalance;
                accountLog.remove("GOLD");
                this.log[0] = "0";
                System.out.println("GOLD account is closed.");
                break;
            case "2":
                accountLog.get("SAVING").closeCurrentAccount();
                this.finalBalance += accountLog.get("SAVING").finalBalance;
                accountLog.remove("SAVING");
                this.log[1] = "0";
                System.out.println("SAVING account is closed.");
                break;
            case "3":
                accountLog.get("INTEREST").closeCurrentAccount();
                this.finalBalance += accountLog.get("INTEREST").finalBalance;
                accountLog.remove("INTEREST");
                this.log[2] = "0";
                System.out.println("INTEREST account is closed.");
                break;
        }
    }

    void closeMainAccount() throws IOException {
        for (int i = 0; i < 3; i++) {
            if (log[i].equals("1")) closeAccount(String.valueOf(i+1));
        }
        System.out.println("All Sub-Accounts are closed.\nAre you really sure to close this MAIN ACCOUNT?");
        if (!scanReader.scanString().equalsIgnoreCase("no")) {
            this.mainLog = false;
            this.log[4] = "exit";
        }
    }

    void closeCurrentAccount() {
        switch (this.accountType) {
            case "GOLD":
                this.finalBalance += this.goldWallet * returnRate;
                this.goldWallet = 0;
                break;
            case "SAVING":
                this.finalBalance += this.savingWallet * returnRate;
                this.savingWallet = 0;
                break;
            case "INTEREST":
                this.finalBalance += this.interestWallet * returnRate;
                this.interestWallet = 0;
                break;
        }
    }

    void addAccount(String AccType) throws IOException {
        String account;
        while (true) {
            switch (AccType) {
                case "1":
                    account = "GOLD";
                    break;
                case "2":
                    account = "SAVING";
                    break;
                case "3":
                    account = "INTEREST";
                    break;
                default:
                    System.out.println("Please enter a valid input: ");
                    AccType = scanReader.scanString();
                    continue;
            }
            break;
        }
        accountLog.put(account, new Denizbank(account, 0, this.accountHolder, this.log));
    }

    void switchAccount(String AccType) throws IOException {
        String account;
        while (true) {
            switch (AccType) {
                case "1":
                    account = "GOLD";
                    break;
                case "2":
                    account = "SAVING";
                    break;
                case "3":
                    account = "INTEREST";
                    break;
                case "4":
                    account = "FINAL BALANCE";
                    break;
                default:
                    System.out.println("Please enter a valid number: ");
                    AccType = scanReader.scanString();
                    continue;
            }
            break;
        }

        if (this.accountType.equals("FinalBalance")) {

            accountLog.get(account).log = this.log;
            this.log[3] = "";
            accountLog.get(account).menu(true);
            this.log = accountLog.get(account).log;           // GET THE LOG FROM SUB-ACCOUNT
            //accountLog.get(account).log[3] = "";            // DELETE THE LOG switchTo IN SUB-ACCOUNT
        } else {
            this.log[3] = account;          // log.switchTo =
            this.log[4] = "exit";
        }
    }

    void showResult(String showWhat) {
        if (showWhat.equals("SubAccount")) {     // SHOW ONLY EXISTING ACCOUNT
            System.out.println("Please choose an account type: ");
            String value1 = "", value2 = "", value3 = "";
            if (this.log[0].equals("1")) {
                value1 = "1.Gold";
            }
            if (this.log[1].equals("1")) {
                value2 = "2.Saving";
            }
            if (this.log[2].equals("1")) {
                value3 = "3.Interest";
            }

            switch (this.accountType) {

                case "GOLD":
                    System.out.println(value2 + " " + value3 + " 4. Final Balance");
                    break;
                case "SAVING":
                    System.out.println(value1 + " " + value3 + " 4. Final Balance");
                    break;
                case "INTEREST":
                    System.out.println(value1 + " " + value2 + " 4. Final Balance");
                    break;
                case "FinalBalance":
                    System.out.println(value1 + " " + value2 + " " + value3);
                    break;
            }
        } else {      //IF A NEW ACCOUNT WILL BE ADDED
            System.out.println("Which account type would you want to add?\n");
            String value1 = "", value2 = "", value3 = "";
            if (log[0].equals("0")) {
                value1 = "1.Gold";
            }
            if (log[1].equals("0")) {
                value2 = "2.Saving";
            }
            if (log[2].equals("0")) {
                value3 = "3.Interest";
            }
            System.out.println(value1 + " " + value2 + " " + value3);
        }
    }
}