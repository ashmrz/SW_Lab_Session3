package bridge;

public class Mult2 extends Mult {
    @Override
    private double calculate(double a, double b) {
        return a * (b - 1) + a;
    }
}
