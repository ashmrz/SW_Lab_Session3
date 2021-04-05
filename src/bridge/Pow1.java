package bridge;

public class Pow1 extends Pow{
    @Override
    public double calculate(double a, double b, Mult mult) {
        return mult.calculate(a, Math.pow(a, b - 1));
    }
}
