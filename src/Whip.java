public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.setDescription(" with whip");
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
