public class A5 extends Umschlag{

    final int height = 210;
    private double weight;

    public A5(double weight){
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
