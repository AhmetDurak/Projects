package SlaryCalculator;

public class Salary {
    double hourlyRate, stateTaxRate, federalTaxRate;
    int weeklyHours;

    Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours){
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    double salary(){
        return  hourlyRate * weeklyHours * 52;
    }

    double stateTax(){
        return salary() * stateTaxRate;
    }

    double federalTax(){
        return salary() * federalTaxRate;
    }

    double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }
    String DataToString(){
        return "SalaryCalculator{" +
                "hourlyRate: " + hourlyRate +
                ", weeklyHour: " + weeklyHours+
                ", salary: $" + (int)(salary()/12) +
                ", stateTax: $" + stateTax()+
                ", federalTax: $" + federalTax()+
                ", salaryAfterTax: $" + (int)salaryAfterTax()/12 + "}";

    }
    void data(){
        System.out.printf("%.1f", salary()/12);
    }


}
