import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Rellena los 5 valores: ");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
    }
}
