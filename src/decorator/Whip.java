package decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with whip";
    }
}
