package homeWork3.calks.additional;

import homeWork3.calks.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator iCalculator;
    private long countOperation;

    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public ICalculator getICalculator() {
        return this.iCalculator;
    }

    /**
     * Метод деления
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    @Override
    public double division(double firstDigit, double secondDigit) {
        countOperation++;
        return iCalculator.division(firstDigit, secondDigit);
    }

    /**
     * Метод умножения
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    @Override
    public double multiply(double firstDigit, double secondDigit) {
        countOperation++;
        return iCalculator.multiply(firstDigit, secondDigit);
    }

    /**
     * Метод вычитание
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    @Override
    public double subtraction(double firstDigit, double secondDigit) {
        countOperation++;
        return iCalculator.subtraction(firstDigit, secondDigit);
    }

    /**
     * Метод сложение
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    @Override
    public double addition(double firstDigit, double secondDigit) {
        countOperation++;
        return iCalculator.addition(firstDigit, secondDigit);
    }

    /**
     * Возведение в целую степень
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    @Override
    public double exponentiation(double digit, int powDigit) {
        countOperation++;
        return iCalculator.exponentiation(digit, powDigit);
    }

    /**
     * Модуль числа
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    @Override
    public double modulus(double digit) {
        countOperation++;
        return iCalculator.modulus(digit);
    }

    /**
     * Квадратный корень из числа
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    @Override
    public double squareRoot(double digit) {
        countOperation++;
        return iCalculator.squareRoot(digit);
    }

    /**
     * Возврощает колличество использований калькулятора
     * @return колличество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }
}