public class A6 extends Umschlag{

    final int height = 148;
    private double weight;

    public A6(double weight){
        this.weight = weight;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
