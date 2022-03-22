package SuperKeyword;

class Vehicle {
    Vehicle(){
        System.out.println("Vehicle constructor!");
    }

    int maxSpeed = 120;

    public void vroom(){
        System.out.println("Vroom vroom");
    }

}

class Car extends Vehicle {


    int maxSpeed = 100;

    public void display() {
        System.out.println(super.maxSpeed);     // super with fields
    }

    @Override
    public void vroom() {// super with methods
        super.vroom();
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //System.out.println(car.maxSpeed);
        car.display();

        car.vroom();
    }
}
