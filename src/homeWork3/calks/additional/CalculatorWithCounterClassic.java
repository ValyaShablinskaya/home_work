package homeWork3.calks.additional;

import homeWork3.calks.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation;

    /**
     * Считает колличество использований калькулятора
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * Возврощает колличество использований калькулятора
     * @return колличество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }
}
