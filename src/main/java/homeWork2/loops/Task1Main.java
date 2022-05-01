package homeWork2.loops;

public class Task1Main {
    public static void main(String[] args) {
        Task1One task1One = new Task1One();
        Task1Two task1Two = new Task1Two();
        Task1Three task1Three = new Task1Three();

        long digit = Long.parseLong(args[0]);


        System.out.println(task1One.multiply(digit));// перемножение чисел, используя цикл
        System.out.println(task1Two.multiply(digit)); // перемножение чисел используя рекурсию
        System.out.println(task1Three.multiplyNumber(args));
    }
}
