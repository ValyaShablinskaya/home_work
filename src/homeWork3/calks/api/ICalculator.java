package homeWork3.calks.api;

public interface ICalculator {

    /**
     * Метод деления
     * @param firstDigit  делимое
     * @param secondDigit делитель
     */
    double division(double firstDigit, double secondDigit);

    /**
     * Метод умножения
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     */
    double multiply(double firstDigit, double secondDigit);

    /**
     * Метод вычитание
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     */
    double subtraction(double firstDigit, double secondDigit);

    /**
     * Метод сложение
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     */
    double addition(double firstDigit, double secondDigit);

    /**
     * Возведение в целую степень
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     */
    double exponentiation(double digit, int powDigit);

    /**
     * Модуль числа
     * @param digit введенное число
     */
    double modulus(double digit);

    /**
     * Квадратный корень из числа
     * @param digit введенное число
     */
    double squareRoot(double digit);
}
