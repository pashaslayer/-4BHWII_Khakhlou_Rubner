import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Umschlag umschlag = null;

        String art;
        double gewicht;

        UmschlagFactory factory = new UmschlagFactory();

        Scanner reader = new Scanner(System.in);

        System.out.println("Wählen Sie eine Art vom Umschlag (A4, A5, A6): ");
        art = reader.nextLine();

        System.out.println("Geben Sie das Gewicht vom Umschlag ein: ");
        gewicht = reader.nextDouble();

        umschlag = factory.createUmschlag(art, gewicht);
        System.out.println(umschlag);



    }
}