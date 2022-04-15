package homeWork3.calks.simple;

import homeWork3.calks.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     * Метод деления
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    public double division(double firstDigit, double secondDigit) {
        return firstDigit / secondDigit;
    }

    /**
     * Метод умножения
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    public double multiply(double firstDigit, double secondDigit) {
        return firstDigit * secondDigit;
    }

    /**
     * Метод вычитание
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    public double subtraction(double firstDigit, double secondDigit) {
        return firstDigit - secondDigit;
    }

    /**
     * Метод сложение
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    public double addition(double firstDigit, double secondDigit) {
        return firstDigit + secondDigit;
    }

    /**
     * Возведение в целую степень
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    public double exponentiation(double digit, int powDigit) {
        double result = 1;

        if (digit > 0) {
            for (int i = 1; i <= powDigit; i++) {
                result = result * digit;
            }
        }
        return result;
    }

    /**
     * Модуль числа
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    public double modulus(double digit) {

        if (digit < 0) {
            return -digit;
        } else {
            return digit;
        }
    }

    /**
     * Квадратный корень из числа
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    public double squareRoot(double digit) {
        double num;
        double half = digit / 2;
        do {
            num = half;
            half = (num + (digit / num)) / 2;
        }
        while ((num - half) != 0);
        return half;
    }
}
