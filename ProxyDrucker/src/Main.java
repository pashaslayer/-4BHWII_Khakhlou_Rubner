public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterProxy();

        printer.print(0);
        printer.print(999999);
        printer.print(9);
        printer.print(99);
    }
}