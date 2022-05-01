package homeWork1;

import java.io.Serializable;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int e = 2;

        int i = 5 + 2 / 8; // 5 При делении int преобразует дробное значение до целого с потерей дробного остатка
        System.out.println(i);

        int j = (5 + 2) / 8; // 0 При делении int преобразует дробное значение до целого с потерей дробного остатка
        System.out.println(j);

        int b = (5 + e++) / --a; // 1=(5+2)/7
        System.out.println(b);

        a = 8;
        e = 2;

        int l = (5 * 2 >> e++) / --a; // 0 В результате побитового сдвига вправо на 2 для числа 10 получаем 2.
        // Далее при делении 2 на 6 получаем 0.
        System.out.println(l);

        a = 8;
        e = 2;

        int k = (5 + 7 > 20 ? 68 : 22 * 2 >> e++) / --a; // 1  Так как 13 не больше 20, выполняем 22 * 2 >> 2.
        //Получаем 11. Далее делим 11 на 8
        System.out.println(k);

        a = 8;
        e = 2;

        //int h = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> e++) / --a; Ошибка. Несовместимые типы

        boolean f = 6 - 2 > 3 && 12 * 12 <= 119; // false Так первое выражение true а второе false
        System.out.println(f);

        boolean r = true && false; //false Так первое выражение true а второе false
        System.out.println(r);
    }
}
