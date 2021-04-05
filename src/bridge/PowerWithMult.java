package bridge;

public class PowerWithMult {
    private Mult mult;
    private Pow pow;

    public double calculate(double a, double b) {
        return pow.calculate(a, b, mult);
    }
}
