package decorator;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }
}
