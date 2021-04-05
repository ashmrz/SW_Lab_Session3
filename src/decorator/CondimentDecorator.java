package decorator;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;

    @Override
    public double cost() {
        return getBeverage().cost();
    }

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription();
    }
}
