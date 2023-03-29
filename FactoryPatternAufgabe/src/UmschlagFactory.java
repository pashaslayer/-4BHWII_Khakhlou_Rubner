public class UmschlagFactory {

    public Umschlag createUmschlag(String format, double weight){

        Umschlag u = null;

        if(format.toUpperCase().equals("A4")){
            return new A4(weight);
        }

        if(format.toUpperCase().equals("A5")){
            return new A5(weight);
        }

        if(format.toUpperCase().equals("A6")){
            return new A6(weight);
        }
        else return null;
    }
}
