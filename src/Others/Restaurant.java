package Others;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    String owner, location;
    int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    Restaurant(String owner, String location, int numberOfStars){
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    void hireServer(Server server){
        this.servers.add(server);
    }
    void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    void hireChef(Chef chef){
        this.chefs.add(chef);
    }
    void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    void terminateChef(int employeeID){
        chefs.removeIf(each -> each.employeeID == employeeID);
    }
    void terminateServer(int employeeID){
        servers.removeIf(id -> id.employeeID == employeeID);
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Betül","Stuttgart",5);

        restaurant.hireChef(new Chef());
        System.out.println(restaurant.chefs.get(0).employeeID);

        Restaurant restaurant2 = new Restaurant("Betül", "Stuttgart", 3);

        restaurant2.hireChef(new Chef[]{new Chef(), new Chef(), new Chef()});

        restaurant2.chefs.forEach(each -> System.out.println(each.employeeID));

    }


}
class Server{
    int employeeID = 1;
}

class Chef{
    int employeeID = 0;
    {
        employeeID++;
    }
}
