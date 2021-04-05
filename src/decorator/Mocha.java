package decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mocha";
    }
}
