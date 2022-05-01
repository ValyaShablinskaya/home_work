package homeWork3.runners;

import homeWork3.calks.additional.CalculatorWithCounterAutoDecorator;
import homeWork3.calks.additional.CalculatorWithMemoryDecorator;
import homeWork3.calks.api.ICalculator;
import homeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new CalculatorWithCounterAutoDecorator
                (new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        CalculatorWithCounterAutoDecorator calculatorWithCounterAutoDecorator =
                (CalculatorWithCounterAutoDecorator) iCalculator;
        CalculatorWithMemoryDecorator calculatorWithMemoryDecorator =
                (CalculatorWithMemoryDecorator) calculatorWithCounterAutoDecorator.getICalculator();

        System.out.println(iCalculator.addition(iCalculator.addition(4.1, iCalculator.multiply(15, 7)),
                iCalculator.exponentiation(iCalculator.division(28, 5), 2)));

        calculatorWithMemoryDecorator.lastResult();

        System.out.println(calculatorWithCounterAutoDecorator.getCountOperation());
        System.out.println(calculatorWithMemoryDecorator.getLastResult());
    }
}
