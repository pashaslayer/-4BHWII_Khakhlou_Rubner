public class Main {
    public static void main(String[] args) {

        // Lazy Singleton
        Printer printer;
        printer = Printer.getPrinter();

        printer.print();


        // trying to create a second printer instance
        Printer printer2;
        printer2 = Printer.getPrinter();

        printer2.print();
    }
}