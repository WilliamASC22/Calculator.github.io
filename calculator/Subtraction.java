package calculator;

public class Subtraction implements Calculate {
    @Override
    public double apply(double a, double b) {
        return a - b;
    }
}