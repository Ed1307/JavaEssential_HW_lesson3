package printer;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        Printer pp = new ColorPrinter();

        p.print("Hello");
        pp.print("Hello");
    }
}
