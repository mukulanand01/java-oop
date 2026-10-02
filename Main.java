class Car {
    String name;
    int price;

    Car() {
        name = "BMW";
        price = 5000000;  // If u remove this complier auto create the constructor 
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println(c1.name);
        System.out.println(c1.price);
    }
}




