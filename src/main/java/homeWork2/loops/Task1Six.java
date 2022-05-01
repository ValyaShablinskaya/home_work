package homeWork2.loops;

public class Task1Six {

    // Выводит таблицу умножения в консоль
    public void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            String strOne = "";

            for (int j = 2; j <= 5; j++) {
                strOne += (Integer.toString(j) + " * " + Integer.toString(i) + " = " +
                        Integer.toString(i * j) + "\t");
            }
            System.out.println(strOne);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            String strTwo = "";

            for (int j = 6; j < 10; j++) {
                strTwo += (Integer.toString(j) + " * " + Integer.toString(i) + " = " +
                        Integer.toString(i * j) + "\t");
            }
            System.out.println(strTwo);
        }
    }
}