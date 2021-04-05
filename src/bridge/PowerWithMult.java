package bridge;

public class PowerWithMult {
    private Mult mult;
    private Pow pow;

    public double calculate(double a, double b) {
        return pow.calculate(a, b, mult);
    }

    public PowerWithMult(Pow pow, Mult mult) {
        this.mult = mult;
        this.pow = pow;
    }
}
