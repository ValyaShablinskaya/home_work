package homeWork1;

public class Task1Part2 {
    public static void main(String[] args) {
        int a = -42; //11010110
        int b = -15; //11110001
        double c = 42.5; //00101010.10000000

        int z = ~a; // z=00101001; a=11010110
        System.out.println(z);

        z = ~b; // z=00001110; b=11110001
        System.out.println(z);

        z = a & b; // z=11010000; a=11010110; b=11110001
        System.out.println(z);

        z = a | b; // z=11110111; a=11010110; b=11110001
        System.out.println(z);

        z = a ^ b; // z=00100111; a=11010110; b=11110001
        System.out.println(z);

        z = a << 2; // z=01011000; a=11010110
        System.out.println(z);

        z = b << 2; // z=11000100; b=11110001
        System.out.println(z);

        z = a >> 2; // z=11110101; a=11010110
        System.out.println(z);

        z = b >> 2; // z=11111100; b=11110001
        System.out.println(z);

        z = a >>> 2; // z=11110101; a=11010110
        System.out.println(z);

        z = b >>> 2; // z=11111100; b=11110001
        System.out.println(z);

        //double z = ~c; Побитовые операции могут быть применены только к целочисленным типам
    }
}
