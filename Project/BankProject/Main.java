package BankProject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    HashMap<String, Akbank> accountHolderAkbank = new HashMap<>();
    HashMap<String, Denizbank> accountHolderDenizbank = new HashMap<>();


    Scanner scanner = new Scanner(System.in);
    String bankName, name;
    boolean MainLog;


    public static void main(String[] args) throws IOException {

        new Main().run();

    }

    void run() throws IOException {
        System.out.println("Bank name: \n1. Akbank\n2. Denizbank");
        bankName = scanner.nextLine();
        System.out.println("Your name: ");
        name = scanner.nextLine();

        if (bankName.equals("1")) {
            accountHolderAkbank.put(name, new Akbank(name));
            this.MainLog = accountHolderAkbank.get(name).mainLog;
            if (!this.MainLog) {
                System.out.println("Total money: " + accountHolderAkbank.get(name).finalBalance);
                accountHolderAkbank.remove(name);
            }
        }
        if (bankName.equals("2")) {
            accountHolderDenizbank.put(name, new Denizbank(name));
            this.MainLog = accountHolderDenizbank.get(name).mainLog;
            if (!this.MainLog) {
                System.out.println("Total money: " + accountHolderDenizbank.get(name).finalBalance);
                accountHolderDenizbank.remove(name);
            }


//            System.out.println("return info");
//            accountHolderAkbank.get(scanner.nextLine()).returnAllInfo();
//            accountHolderDenizbank.get(scanner.nextLine()).returnAllInfo();
        }
    }
}
