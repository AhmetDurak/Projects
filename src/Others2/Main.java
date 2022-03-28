package Others2;

public class Main {
    public enum Company{
        EBAY(30), PAYPAL(30), GOOGLE(50), YAHOO(60), ATT(80);

        private int deger;

        private Company(int value){
            this.deger = value;
        }
    }

    Company cName;
    public Main(Company cName){
        this.cName = cName;
    }
    public void companyDetails(){
        switch(cName){
            case EBAY:
                System.out.println("EBAY: ");
                break;
            case GOOGLE:
                System.out.println("GOOGLE: ");
                break;
            case PAYPAL:
                System.out.println("PAYPAL: ");
                break;
            case YAHOO:
                System.out.println("YAHOO: ");
                break;
            case ATT:
                System.out.println("ATT: ");
                break;
        }

    }

    public static void main(String[] args) {
        for (Company cName: Company.values()){
            System.out.println("Company value: " + cName.deger + " - Company Name: " + cName);

        }
    }

}
