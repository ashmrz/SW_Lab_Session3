public class SteamedMilk extends CondimentDecorator{

    public SteamedMilk(Beverage beverage) {
        this.setDescription(" with milk");
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description();
    }
}
