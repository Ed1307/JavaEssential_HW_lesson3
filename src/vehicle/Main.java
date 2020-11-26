package vehicle;

public class Main {
    public static void main(String[] args) {
        Plane p = new Plane(10000, 1000, 1945, 30, 4);
        Ship sh = new Ship(100000, 40, 1970, 300, "Odessa");
        Car c = new Car(1000, 300, 1992);
        System.out.println(p.price+" " + p.speed + " " + p.year + " " + p.height + " " + p.passengers);
        System.out.println(sh.price+" "+sh.speed+" "+sh.year+" "+sh.passengers+" "+sh.port);
        System.out.println(c.price+" "+c.speed+" "+c.year);
    }
}
