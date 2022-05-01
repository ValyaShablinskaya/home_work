package homeWork3.runners;

import homeWork3.calks.additional.CalculatorWithCounterAutoAggregation;
import homeWork3.calks.additional.CalculatorWithCounterAutoComposite;
import homeWork3.calks.simple.CalculatorWithMathCopy;
import homeWork3.calks.simple.CalculatorWithMathExtends;
import homeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite =
                new CalculatorWithCounterAutoComposite();
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAggregation calculatorOne =
                new CalculatorWithCounterAutoAggregation(calculatorWithOperator);
        CalculatorWithCounterAutoAggregation calculatorTwo =
                new CalculatorWithCounterAutoAggregation(calculatorWithMathCopy);
        CalculatorWithCounterAutoAggregation calculatorThree =
                new CalculatorWithCounterAutoAggregation(calculatorWithMathExtends);

        double multiply = calculatorWithCounterAutoComposite.multiply(15, 7);
        double division = calculatorWithCounterAutoComposite.division(28, 5);
        double pow = calculatorWithCounterAutoComposite.exponentiation(division, 2);
        double sumFirst = calculatorWithCounterAutoComposite.addition(4.1, multiply);
        double sumSecond = calculatorWithCounterAutoComposite.addition(sumFirst, pow);

        System.out.println(sumSecond);
        System.out.println(calculatorWithCounterAutoComposite.getCountOperation());

        double multiply2 = calculatorOne.multiplyForCalculatorWithOperator(15, 7);
        double division2 = calculatorOne.divisionForCalculatorWithOperator(28, 5);
        double pow2 = calculatorOne.exponentiationForCalculatorWithOperator(division2, 2);
        double sumFirst2 = calculatorOne.additionForCalculatorWithOperator(4.1, multiply2);
        double sumSecond2 = calculatorOne.additionForCalculatorWithOperator(sumFirst2, pow2);

        System.out.println(sumSecond2);
        System.out.println(calculatorOne.getCountOperation());

        double multiply3 = calculatorTwo.multiplyForCalculatorWithMathCopy(15, 7);
        double division3 = calculatorTwo.divisionForCalculatorWithMathCopy(28, 5);
        double pow3 = calculatorTwo.exponentiationForCalculatorWithMathCopy(division3, 2);
        double sumFirst3 = calculatorTwo.additionForCalculatorWithMathCopy(4.1, multiply3);
        double sumSecond3 = calculatorTwo.additionForCalculatorWithMathCopy(sumFirst3, pow3);

        System.out.println(sumSecond3);
        System.out.println(calculatorTwo.getCountOperation());

        double multiply4 = calculatorThree.multiplyForCalculatorWithMathExtends(15, 7);
        double division4 = calculatorThree.divisionForCalculatorWithMathExtends(28, 5);
        double pow4 = calculatorThree.exponentiationForCalculatorWithMathExtends(division4, 2);
        double sumFirst4 = calculatorThree.additionForCalculatorWithMathExtends(4.1, multiply4);
        double sumSecond4 = calculatorThree.additionForCalculatorWithMathExtends(sumFirst4, pow4);

        System.out.println(sumSecond4);
        System.out.println(calculatorThree.getCountOperation());
    }
}