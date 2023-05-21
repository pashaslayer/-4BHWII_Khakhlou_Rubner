public class ColorPrinter implements Printer{
    @Override
    public void print(int amount) {
        System.out.println("A small task with: " + amount + " pages [COLORED]\n");
    }
}
