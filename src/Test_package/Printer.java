package Test_package;

import java.util.ArrayList;

public class Printer<T extends Cat> {

    T printCount;

    void printIt(T text) {
        System.out.println(text);
    }

}
