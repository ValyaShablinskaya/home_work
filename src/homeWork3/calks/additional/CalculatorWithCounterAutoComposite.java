package homeWork3.calks.additional;

import homeWork3.calks.simple.CalculatorWithMathExtends;
import homeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long countOperation = 0;

    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

    /**
     * Метод деления
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    public double division(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.division(firstDigit, secondDigit);
    }

    /**
     * Метод умножения
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    public double multiply(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.multiply(firstDigit, secondDigit);
    }

    /**
     * Метод вычитание
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    public double subtraction(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.subtraction(firstDigit, secondDigit);
    }

    /**
     * Метод сложение
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    public double addition(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.addition(firstDigit, secondDigit);
    }

    /**
     * Возведение в целую степень
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    public double exponentiation(double digit, int powDigit) {
        countOperation++;
        return calculatorWithOperator.exponentiation(digit, powDigit);
    }

    /**
     * Модуль числа
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    public double modulus(double digit) {
        countOperation++;
        return calculatorWithOperator.modulus(digit);
    }

    /**
     * Квадратный корень из числа
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    public double squareRoot(double digit) {
        countOperation++;
        return calculatorWithOperator.squareRoot(digit);
    }

    /**
     * Возврощает колличество использований калькулятора
     * @return колличество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }
}