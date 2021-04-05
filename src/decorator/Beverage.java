package decorator;

public abstract class Beverage {
    private String description = "Delicious Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
