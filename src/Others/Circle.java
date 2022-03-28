package Others;

import java.util.ArrayList;

public class Circle {

    public int radius;
    public static double pi = 3.14;
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    static class SmallCircle{

    }


    void calculateArea(int radius) {
        this.radius = radius;

        System.out.println(pi * (radius * radius));
    }


    static {

        list = new ArrayList<>();

        list.add("Betül");

        list.add("Ahmet");

        list.add("Murat");

    }

}

class Other {
    void other() {
        Circle.list.add("Kemal");
    }
}


