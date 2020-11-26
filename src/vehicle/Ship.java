package vehicle;

public class Ship extends Vehicle{
    int passengers;
    String port;

    public Ship(int price, int speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }
}
