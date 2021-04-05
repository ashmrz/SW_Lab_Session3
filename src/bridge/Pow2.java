package bridge;

public class Pow2 extends Pow {
    @Override
    public double calculate(double a, double b, Mult mult) {
        return mult.calculate(mult.calculate(a, a), Math.pow(a, b - 2));
    }
}
