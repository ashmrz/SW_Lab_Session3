public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.setDescription(" with mocha");
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
