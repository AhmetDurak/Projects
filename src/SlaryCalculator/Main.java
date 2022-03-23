package SlaryCalculator;

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary(25,0.12,0.18,40);

        System.out.println(salary.DataToString());

        salary.data();
    }
}
