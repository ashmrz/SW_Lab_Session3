public class Espresso extends Beverage{

    public Espresso() {
        this.setDescription("Delicious Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
