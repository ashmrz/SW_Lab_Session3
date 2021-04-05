public class Decaf extends Beverage{

    public Decaf() {
        this.setDescription("Delicious Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
