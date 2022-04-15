package homeWork3.runners;

import homeWork3.calks.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();

        double multiply = calculatorWithCounterAutoSuper.multiply(15, 7);
        double division = calculatorWithCounterAutoSuper.division(28, 5);
        double pow = calculatorWithCounterAutoSuper.exponentiation(division, 2);
        double sumFirst = calculatorWithCounterAutoSuper.addition(4.1, multiply);
        double sumSecond = calculatorWithCounterAutoSuper.addition(sumFirst, pow);

        long countOperation = calculatorWithCounterAutoSuper.getCountOperation();

        System.out.println(sumSecond);
        System.out.println(countOperation);
    }
}
