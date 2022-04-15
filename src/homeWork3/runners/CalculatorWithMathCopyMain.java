package homeWork3.runners;

import homeWork3.calks.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        double multiply = calculatorWithMathCopy.multiply(15, 7);
        double division = calculatorWithMathCopy.division(28, 5);
        double pow = calculatorWithMathCopy.exponentiation(division, 2);
        double sumFirst = calculatorWithMathCopy.addition(4.1, multiply);
        double sumSecond = calculatorWithMathCopy.addition(sumFirst, pow);

        System.out.println(sumSecond);
    }
}
