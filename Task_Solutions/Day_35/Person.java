package Day_35;

public class Person {
    String name, language;
    int age;
    boolean gender;

    static String planet;
    static boolean isHuman, hasNose;
    static int numberOfWings, numberOfHead;

    public Person(String name, String language, int age, boolean gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        planet = "earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    static String printPlanetName(){
        return planet;
    }
    void eat(String food){
        System.out.println(this.name + " eats " + food);
    }
    void drink(String drink){
        System.out.println(this.name + " eats " + drink);
    }

    public String toString(){
        return "Person {" +
                "name = " + name + "\'" +
                "age = " + age + "\'" +
                "gender = " + gender + "\'" +
                "language = " + language + "\'" +
                "planet = " + planet + "\'";
    }
}
