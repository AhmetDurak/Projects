package SellTicket;

public class PassengerLog {

    public static String[] LogFlixbus = new String[5];
    public static String[] LogEgetur = new String[5];
    public static String[] LogAydoganlar = new String[5];
    public static String[] LogHasAdana = new String[5];

    public static String[] LogTurkishAir = new String[15];
    public static String[] LogEurowings = new String[15];
    public static String[] LogFranceAir = new String[15];
    public static String[] LogLufthansa = new String[15];

    public static String[] LogUbahn = new String[10];
    public static String[] LogSbahn = new String[10];
    public static String[] LogIre = new String[10];
    public static String[] LogIce = new String[10];


    public static void SaveSoldTicketBus(String dateOfTicket, String passengerDetail) {
        String[] splitDetail = passengerDetail.split(" ");

        switch (Bus.companyName) {
            case "Flixbus":
                LogFlixbus[Integer.parseInt(splitDetail[0]) - 1] = Bus.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "Egetur":
                LogEgetur[Integer.parseInt(splitDetail[0]) - 1] = Bus.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "Aydoganlar":
                LogAydoganlar[Integer.parseInt(splitDetail[0]) - 1] = Bus.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "Has Adana":
                LogHasAdana[Integer.parseInt(splitDetail[0]) - 1] = Bus.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
        }

        for (String i : LogFlixbus) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogEgetur) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogAydoganlar) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogHasAdana) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public static void SaveSoldTicketAirlines(String dateOfTicket, String passengerDetail) {
        String[] splitDetail = passengerDetail.split(" ");

        switch (Airline.companyName) {
            case "Turkish Airlines":
                LogTurkishAir[Integer.parseInt(splitDetail[0]) - 1] = Airline.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "Eurowings":
                LogEurowings[Integer.parseInt(splitDetail[0]) - 1] = Airline.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "France Air":
                LogFranceAir[Integer.parseInt(splitDetail[0]) - 1] = Airline.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "Lufthansa":
                LogLufthansa[Integer.parseInt(splitDetail[0]) - 1] = Airline.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
        }

        for (String i : LogTurkishAir) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogEurowings) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogFranceAir) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogLufthansa) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public static void SaveSoldTicketTrain(String dateOfTicket, String passengerDetail) {
        String[] splitDetail = passengerDetail.split(" ");

        switch (Train.companyName) {
            case "U-Bahn":
                LogUbahn[Integer.parseInt(splitDetail[0]) - 1] = Train.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "S-Bahn":
                LogSbahn[Integer.parseInt(splitDetail[0]) - 1] = Train.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "IRE":
                LogIre[Integer.parseInt(splitDetail[0]) - 1] = Train.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
            case "ICE":
                LogIce[Integer.parseInt(splitDetail[0]) - 1] = Train.companyName + ": " + splitDetail[0] + ". is bought from " + splitDetail[2] + " in " + dateOfTicket;
                break;
        }

        for (String i : LogUbahn) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogSbahn) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogIre) {
            if (i != null) {
                System.out.println(i);
            }
        }
        for (String i : LogIce) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }
}