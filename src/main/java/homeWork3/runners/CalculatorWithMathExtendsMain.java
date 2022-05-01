package homeWork3.runners;

import homeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        double multiply = calculatorWithMathExtends.multiply(15, 7);
        double division = calculatorWithMathExtends.division(28, 5);
        double pow = calculatorWithMathExtends.exponentiation(division, 2);
        double sumFirst = calculatorWithMathExtends.addition(4.1, multiply);
        double sumSecond = calculatorWithMathExtends.addition(sumFirst, pow);

        System.out.println(sumSecond);
    }
}
