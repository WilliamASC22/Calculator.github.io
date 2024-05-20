package calculator;

import java.util.Scanner;

public class ScannerCalculator {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner calculator = new Scanner(System.in);
        System.out.print("First number:");

        
        num1 = calculator.nextDouble();
        System.out.print("Second number:");
        num2 = calculator.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        char operator = calculator.next().charAt(0);

        calculator.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            default:
                System.out.printf("Wrong operator");
                return;
        }

        System.out.println(num1 + "" + operator +"" + num2 + ":" + output);
    }
}