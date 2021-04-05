public abstract class CondimentDecorator implements Beverage {
    private Beverage baverage;

    @Override
    public double cost {
        return getBaverage().cost()
    }

    public CondimentDecorator(Beverage beverage) {
        this.baverage = beverage;
    }

    public Beverage getBaverage() {
        return baverage;
    }
}
