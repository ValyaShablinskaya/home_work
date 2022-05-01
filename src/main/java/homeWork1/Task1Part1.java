package homeWork1;

public class Task1Part1 {
    public static void main(String[] args) {
        int x = 42; //00101010
        int y = 15; //00001111

        int z = ~x; // z=11010101; x=00101010
        System.out.println(z);

        z = ~y; // z=11110000; y=00001111
        System.out.println(z);

        z = x & y; // z=00001010; x=00101010; y=00001111
        System.out.println(z);

        z = x | y; // z=00101111; x=00101010; y=00001111
        System.out.println(z);

        z = x ^ y; // z=00100101; x=00101010; y=00001111
        System.out.println(z);

        z = x << 2; // z=10101000; x=00101010
        System.out.println(z);

        z = y << 2; // z=00111100; y=00001111
        System.out.println(z);

        z = x >> 2; // z=00001010; x=00101010
        System.out.println(z);

        z = y >> 2; // z= 00000011; y=00001111
        System.out.println(z);

        z = x >>> 2; // z=00001010; x=00101010
        System.out.println(z);

        z = y >>> 2; // z=00000011; y=00001111
        System.out.println(z);
    }
}
