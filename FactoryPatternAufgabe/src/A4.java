public class A4 extends Umschlag{

    final int height = 297;
    private double weight;

    public A4(double weight){
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
