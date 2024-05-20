package calculator;

public class Addition implements Calculate {
    
    @Override
    public double apply(double a, double b) {
        return a + b;
    }

}
