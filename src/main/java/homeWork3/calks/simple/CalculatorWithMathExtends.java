package homeWork3.calks.simple;

import homeWork3.calks.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Метод деления
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    @Override
    public double division(double firstDigit, double secondDigit) {
        return super.division(firstDigit, secondDigit);
    }

    /**
     * Метод умножения
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    @Override
    public double multiply(double firstDigit, double secondDigit) {
        return super.multiply(firstDigit, secondDigit);
    }

    /**
     * Метод вычитание
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    @Override
    public double subtraction(double firstDigit, double secondDigit) {
        return super.subtraction(firstDigit, secondDigit);
    }

    /**
     * Метод сложение
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    @Override
    public double addition(double firstDigit, double secondDigit) {
        return super.addition(firstDigit, secondDigit);
    }

    /**
     * Возведение в целую степень
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    @Override
    public double exponentiation(double digit, int powDigit) {
        return Math.pow(digit, powDigit);
    }

    /**
     * Модуль числа
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    @Override
    public double modulus(double digit) {
        return Math.abs(digit);
    }

    /**
     * Квадратный корень из числа
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    @Override
    public double squareRoot(double digit) {
        return Math.sqrt(digit);
    }
}
