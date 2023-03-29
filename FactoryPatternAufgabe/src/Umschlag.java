public abstract class Umschlag {

    public abstract int getHeight();

    public abstract double getWeight();

    @Override
    public String toString(){
        return "height: " + getHeight() + "\n" + "weight: " + getWeight();
    }
}
