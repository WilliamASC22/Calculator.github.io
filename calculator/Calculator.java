package calculator;

public class Calculator {
    private double current;
    private double stored;
    private Calculate currentO;
    private boolean decimal;
    private int count;
    private double s;
    private int sSet;


    public Calculator() {
        this.current = 0.0;
        this.stored = 0.0;
        this.currentO = null;
        this.decimal = false;
        this.s = 0.0;
        this.sSet = 0;
    }

    public double displayNumber() {
        return current;
    }

    public void clearPressed() {
        current = 0.0;
        stored = 0.0;
        currentO = null;
        decimal = false;
        s = 0.0;
        sSet = 0;
    }

    public void numberPressed(int num) {
        double factor = decimal ? Math.pow(10, count + 1) : 10;
        current = decimal ? current + (num / factor) : current * 10 + num;
        count = decimal ? count + 1 : count;
    }

    public void dividePressed() {
        calculate(new Division());
    }

    public void multiplyPressed() {
        calculate(new Multiplication());
    }

    public void subtractPressed() {
        calculate(new Subtraction());
    }

    public void addPressed() {
        calculate(new Addition());
    }

    public void equalsPressed() {
        currentO = (currentO != null) ? currentO : new Addition();
        s = (sSet == 0) ? current : s;
        sSet += (sSet == 0) ? 1 : 0;
        current = currentO.apply(stored, current);
        stored = s;

        currentO = null;
        
    }

    public void decimalPressed() {
        decimal = true;

    }

    private void calculate(Calculate c) {
        stored = current;
        current = 0.0;
        currentO = c;

    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.numberPressed(1);
        calculator.decimalPressed();
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.numberPressed(0);
        calculator.decimalPressed();
        calculator.numberPressed(5);
    }
}