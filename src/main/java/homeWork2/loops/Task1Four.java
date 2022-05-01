package homeWork2.loops;


public class Task1Four {
    // Возведение в степень
    public String exponentiation(double digit, long powDigit) {
        double result = 1;
        if (digit > 0) {
            for (int i = 1; i <= powDigit; i++) {
                result = result * digit;
            }
        }
        return digit + " ^ " + powDigit + " = " + result;
    }
}
