package homeWork3.runners;

import homeWork3.calks.additional.CalculatorWithCounterAutoAggregationInterface;
import homeWork3.calks.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAggregationInterface calculatorWithCounterAutoAggregationInterface =
                new CalculatorWithCounterAutoAggregationInterface(calculatorWithMathCopy);

        double multiply = calculatorWithCounterAutoAggregationInterface.multiply(15, 7);
        double division = calculatorWithCounterAutoAggregationInterface.division(28, 5);
        double pow = calculatorWithCounterAutoAggregationInterface.exponentiation(division, 2);
        double sumFirst = calculatorWithCounterAutoAggregationInterface.addition(4.1, multiply);
        double sumSecond = calculatorWithCounterAutoAggregationInterface.addition(sumFirst, pow);

        System.out.println(sumSecond);
        System.out.println(calculatorWithCounterAutoAggregationInterface.getCountOperation());
    }
}
