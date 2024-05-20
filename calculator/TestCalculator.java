package calculator;

import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCalculator {

    @Test
    public void initial() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.displayNumber(), 0.0001);

    }

    @Test
    public void input() {
        Calculator calculator = new Calculator();
        calculator.numberPressed(4);
        calculator.numberPressed(6);
        calculator.numberPressed(1);
        assertEquals(461.0, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void basicFunctions() {
        Calculator calculator = new Calculator();

        calculator.numberPressed(2);
        calculator.addPressed();
        calculator.numberPressed(3);
        calculator.equalsPressed();
        assertEquals(5.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();


        calculator.numberPressed(7);
        calculator.subtractPressed();
        calculator.numberPressed(4);
        calculator.equalsPressed();
        assertEquals(3.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();


        calculator.numberPressed(6);
        calculator.multiplyPressed();
        calculator.numberPressed(5);
        calculator.equalsPressed();
        assertEquals(30.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();


        calculator.numberPressed(9);
        calculator.dividePressed();
        calculator.numberPressed(3);
        calculator.equalsPressed();
        assertEquals(3.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();


        calculator.numberPressed(9);
        calculator.dividePressed();
        calculator.numberPressed(0);
        calculator.equalsPressed();
        assertEquals(Double.POSITIVE_INFINITY, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void basicFunctionsE() {
        Calculator calculator = new Calculator();

        calculator.numberPressed(2);
        calculator.addPressed();
        calculator.numberPressed(5);
        calculator.equalsPressed();
        calculator.multiplyPressed();
        calculator.numberPressed(2);
        calculator.equalsPressed();
        assertEquals(14.0, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void hugeNumbers() {
        Calculator calculator = new Calculator();

        calculator.numberPressed(1);
        calculator.numberPressed(2);
        calculator.numberPressed(3);
        calculator.multiplyPressed();
        calculator.numberPressed(4);
        calculator.numberPressed(5);
        calculator.numberPressed(6);
        calculator.equalsPressed();

        assertEquals(123 * 456, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void clearButton() {
        Calculator calculator = new Calculator();
        calculator.numberPressed(5);
        calculator.clearPressed();
        assertEquals(0.0, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void testClearButton() {
        Calculator calculator = new Calculator();
        calculator.numberPressed(5);
        calculator.clearPressed();
        assertEquals(0.0, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void decimal() {
        Calculator calculator = new Calculator();
        calculator.decimalPressed();
        calculator.numberPressed(5);
        assertEquals(0.5, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void hugeDecimals() {
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
        assertEquals(1.25505, calculator.displayNumber(), 0.0001);
    }

    @Test
    public void equals() {
        Calculator calculator = new Calculator();
        calculator.numberPressed(8);
        calculator.addPressed();
        calculator.numberPressed(2);
        calculator.equalsPressed();
        System.out.println(calculator.displayNumber());
        calculator.equalsPressed();
        System.out.println(calculator.displayNumber());
        calculator.equalsPressed();
        System.out.println(calculator.displayNumber());
        assertEquals(14.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();


        calculator.numberPressed(8);
        calculator.subtractPressed();
        calculator.numberPressed(2);
        calculator.equalsPressed();
        System.out.println(calculator.displayNumber());
        calculator.equalsPressed();
        System.out.println(calculator.displayNumber());
        calculator.equalsPressed();
        System.out.println(calculator.displayNumber());
        assertEquals(2.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();

        calculator.numberPressed(8);
        calculator.multiplyPressed();
        calculator.numberPressed(2);
        calculator.equalsPressed();
        calculator.equalsPressed();
        calculator.equalsPressed();
        assertEquals(64.0, calculator.displayNumber(), 0.0001);

        calculator.clearPressed();

        calculator.numberPressed(8);
        calculator.dividePressed();
        calculator.numberPressed(2);
        calculator.equalsPressed();
        calculator.equalsPressed();
        calculator.equalsPressed();
        assertEquals(1.0, calculator.displayNumber(), 0.0001);

    }

}
