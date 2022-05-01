package homeWork3.calks.additional;

import homeWork3.calks.simple.CalculatorWithMathCopy;
import homeWork3.calks.simple.CalculatorWithMathExtends;
import homeWork3.calks.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAggregation {
    private long countOperation;

    private CalculatorWithOperator calculatorWithOperator;
    private  CalculatorWithMathCopy calculatorWithMathCopy;
    private  CalculatorWithMathExtends calculatorWithMathExtends;


    public CalculatorWithCounterAutoAggregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoAggregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public CalculatorWithCounterAutoAggregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    /**
     * Метод деления для calculatorWithOperator
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    public double divisionForCalculatorWithOperator(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.division(firstDigit, secondDigit);
    }

    /**
     * Метод умножения для calculatorWithOperator
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    public double multiplyForCalculatorWithOperator(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.multiply(firstDigit, secondDigit);
    }

    /**
     * Метод вычитание для calculatorWithOperator
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    public double subtractionForCalculatorWithOperator(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.subtraction(firstDigit, secondDigit);
    }

    /**
     * Метод сложение для calculatorWithOperator
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    public double additionForCalculatorWithOperator(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithOperator.addition(firstDigit, secondDigit);
    }

    /**
     * Возведение в целую степень для calculatorWithOperator
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    public double exponentiationForCalculatorWithOperator(double digit, int powDigit) {
        countOperation++;
        return calculatorWithOperator.exponentiation(digit, powDigit);
    }

    /**
     * Модуль числа для calculatorWithOperator
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    public double modulusForCalculatorWithOperator(double digit) {
        countOperation++;
        return calculatorWithOperator.modulus(digit);
    }

    /**
     * Квадратный корень из числа для calculatorWithOperator
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    public double squareRootForCalculatorWithOperator(double digit) {
        countOperation++;
        return calculatorWithOperator.squareRoot(digit);
    }

    /**
     * Метод деления для calculatorWithMathCopy
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    public double divisionForCalculatorWithMathCopy(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathCopy.division(firstDigit, secondDigit);
    }

    /**
     * Метод умножения для calculatorWithMathCopy
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    public double multiplyForCalculatorWithMathCopy(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathCopy.multiply(firstDigit, secondDigit);
    }

    /**
     * Метод вычитание для calculatorWithMathCopy
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    public double subtractionForCalculatorWithMathCopy(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathCopy.subtraction(firstDigit, secondDigit);
    }

    /**
     * Метод сложение для calculatorWithMathCopy
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    public double additionForCalculatorWithMathCopy(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathCopy.addition(firstDigit, secondDigit);
    }

    /**
     * Возведение в целую степень для calculatorWithMathCopy
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    public double exponentiationForCalculatorWithMathCopy(double digit, int powDigit) {
        countOperation++;
        return calculatorWithMathCopy.exponentiation(digit, powDigit);
    }

    /**
     * Модуль числа для calculatorWithMathCopy
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    public double modulusForCalculatorWithMathCopy(double digit) {
        countOperation++;
        return calculatorWithMathCopy.modulus(digit);
    }

    /**
     * Квадратный корень из числа для calculatorWithMathCopy
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    public double squareRootForCalculatorWithMathCopy(double digit) {
        countOperation++;
        return calculatorWithMathCopy.squareRoot(digit);
    }

    /**
     * Возведение в целую степень для calculatorWithMathExtends
     * @param digit    число которое возводим в степень
     * @param powDigit степень
     * @return результае возведения в степень
     */
    public double exponentiationForCalculatorWithMathExtends(double digit, int powDigit) {
        countOperation++;
        return calculatorWithMathExtends.exponentiation(digit, powDigit);
    }

    /**
     * Модуль числа для calculatorWithMathExtends
     * @param digit введенное число
     * @return результат (мы получаем модуль числа)
     */
    public double modulusForCalculatorWithMathExtends(double digit) {
        countOperation++;
        return calculatorWithMathExtends.modulus(digit);
    }

    /**
     * Квадратный корень из числа для calculatorWithMathExtends
     * @param digit введенное число
     * @return возвращает квадратный корень из введенного числа
     */
    public double squareRootForCalculatorWithMathExtends(double digit) {
        countOperation++;
        return calculatorWithMathExtends.squareRoot(digit);
    }

    /**
     * Метод деления для calculatorWithMathExtends
     * @param firstDigit  делимое
     * @param secondDigit делитель
     * @return результат деления
     */
    public double divisionForCalculatorWithMathExtends(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathExtends.division(firstDigit, secondDigit);
    }

    /**
     * Метод умножения для calculatorWithMathExtends
     * @param firstDigit  умножаемое
     * @param secondDigit множитель
     * @return результат умножения
     */
    public double multiplyForCalculatorWithMathExtends(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathExtends.multiply(firstDigit, secondDigit);
    }

    /**
     * Метод вычитание для calculatorWithMathExtends
     * @param firstDigit  уменьшаемое
     * @param secondDigit вычитаемое
     * @return разность
     */
    public double subtractionForCalculatorWithMathExtends(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathExtends.subtraction(firstDigit, secondDigit);
    }

    /**
     * Метод сложение для calculatorWithMathExtends
     * @param firstDigit  первое слагаемое
     * @param secondDigit второе слагаемое
     * @return сумма
     */
    public double additionForCalculatorWithMathExtends(double firstDigit, double secondDigit) {
        countOperation++;
        return calculatorWithMathExtends.addition(firstDigit, secondDigit);
    }

    /**
     * Возврощает колличество использований калькулятора
     * @return колличество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }
}