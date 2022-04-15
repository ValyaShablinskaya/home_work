package homeWork3.runners;

import homeWork3.calks.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic =new CalculatorWithCounterClassic();

        double multiply = calculatorWithCounterClassic.multiply(15, 7);
        calculatorWithCounterClassic.incrementCountOperation();
        double division = calculatorWithCounterClassic.division(28, 5);
        calculatorWithCounterClassic.incrementCountOperation();
        double pow = calculatorWithCounterClassic.exponentiation(division, 2);
        calculatorWithCounterClassic.incrementCountOperation();
        double sumFirst = calculatorWithCounterClassic.addition(4.1, multiply);
        calculatorWithCounterClassic.incrementCountOperation();
        double sumSecond = calculatorWithCounterClassic.addition(sumFirst, pow);
        calculatorWithCounterClassic.incrementCountOperation();

        long countOperation = calculatorWithCounterClassic.getCountOperation();

        System.out.println(sumSecond);
        System.out.println(countOperation);
    }
}
