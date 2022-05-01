package homeWork2.arrays;

import homeWork2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();

        DoWhileOperation doWhileOperation = new DoWhileOperation();
        System.out.println(doWhileOperation.allElements(container));
        System.out.println(doWhileOperation.everySecondElements(container));
        System.out.println(doWhileOperation.reverseOrder(container));

        WhileOperation whileOperation = new WhileOperation();
        System.out.println(whileOperation.allElements(container));
        System.out.println(whileOperation.everySecondElements(container));
        System.out.println(whileOperation.reverseOrder(container));

        ForOperation forOperation = new ForOperation();
        System.out.println(forOperation.allElements(container));
        System.out.println(forOperation.everySecondElements(container));
        System.out.println(forOperation.reverseOrder(container));

        ForEachOperation forEachOperation = new ForEachOperation();
        System.out.println(forEachOperation.allElements(container));
        System.out.println(forEachOperation.everySecondElements(container));
        System.out.println(forEachOperation.reverseOrder(container));
    }
}