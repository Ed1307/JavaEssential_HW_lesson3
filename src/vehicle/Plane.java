package vehicle;

public class Plane extends Vehicle{
    int height;
    int passengers;

    public Plane(int price, int speed, int year, int height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }
}
