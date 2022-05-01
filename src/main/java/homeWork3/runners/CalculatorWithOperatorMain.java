package homeWork3.runners;

import homeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        double multiply = calculatorWithOperator.multiply(15, 7);
        double division = calculatorWithOperator.division(28, 5);
        double pow = calculatorWithOperator.exponentiation(division, 2);
        double sumFirst = calculatorWithOperator.addition(4.1, multiply);
        double sumSecond = calculatorWithOperator.addition(sumFirst, pow);

        System.out.println(sumSecond);
    }
}
