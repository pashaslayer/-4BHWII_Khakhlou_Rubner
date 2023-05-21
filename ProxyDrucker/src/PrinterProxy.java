public class PrinterProxy implements Printer{
    private Printer printer;

    @Override
    public void print(int amount) {

        if(amount <= 0){
            System.out.println("You can not print this amount: " + amount + "\n");
            return;
        }
        else if(amount >= 500){
            System.out.println("The given amount can not be printed [reason: too big; size: " + amount + "]\n");
            return;
        }
        else if(amount < 50){
            this.printer = new ColorPrinter();
        }
        else{
            this.printer = new BWPrinter();
        }

        printer.print(amount);
    }
}
