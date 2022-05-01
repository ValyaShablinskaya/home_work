package homeWork3.calks.additional;

import homeWork3.calks.api.ICalculator;

public class CalculatorWithMemory {
    private double result;
    private double memory;

    private final ICalculator iCalculator;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     * Метод деления
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    public double division(double firstDigit, double secondDigit) {
        result = iCalculator.division(firstDigit, secondDigit);
        return result;
    }

    /**
     * Метод умножения
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    public double multiply(double firstDigit, double secondDigit) {
        result = iCalculator.multiply(firstDigit, secondDigit);
        return result;
    }

    /**
     * Метод вычитание
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    public double subtraction(double firstDigit, double secondDigit) {
        result = iCalculator.subtraction(firstDigit, secondDigit);
        return result;
    }

    /**
     * Метод сложение
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    public double addition(double firstDigit, double secondDigit) {
        result = iCalculator.addition(firstDigit, secondDigit);
        return result;
    }

    /**
     * Возведение в целую степень
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    public double exponentiation(double digit, int powDigit) {
        result = iCalculator.exponentiation(digit, powDigit);
        return result;
    }

    /**
     * Модуль числа
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    public double modulus(double digit) {
        result = iCalculator.modulus(digit);
        return result;
    }

    /**
     * Квадратный корень из числа
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    public double squareRoot(double digit) {
        result = iCalculator.squareRoot(digit);
        return result;
    }

    /**
     * Получвет из памяти результат выполнения последнего вызванного метода
     * @return результат выполнения последнего вызванного метода
     */
    public double getLastResult() {
        this.result = this.memory;
        this.memory = 0;
        return this.result;
    }

    /**
     * Записывает в память результат выполнения последнего вызванного метода
     */
    public void lastResult() {
        this.memory = this.result;
    }
}
