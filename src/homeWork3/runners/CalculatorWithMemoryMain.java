package homeWork3.runners;

import homeWork3.calks.additional.CalculatorWithMemory;
import homeWork3.calks.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(calculatorWithMathCopy);

        calculatorWithMemory.exponentiation(calculatorWithMemory.division(28, 5), 2);
        calculatorWithMemory.lastResult();
        calculatorWithMemory.addition(calculatorWithMemory.multiply(15, 7), calculatorWithMemory.getLastResult());
        calculatorWithMemory.lastResult();
        calculatorWithMemory.addition(4.1, calculatorWithMemory.getLastResult());
        calculatorWithMemory.lastResult();

        System.out.println(calculatorWithMemory.getLastResult());
    }
}
