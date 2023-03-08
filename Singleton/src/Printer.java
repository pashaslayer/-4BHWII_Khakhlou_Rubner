public class Printer {

    private static Printer printer;

    private Printer(){}

    public static Printer getPrinter(){
        if(printer == null){
            printer = new Printer();
        }
        return printer;
    }

    public void print(){
        System.out.println("I print, I am the object: " + printer);
    }
}
