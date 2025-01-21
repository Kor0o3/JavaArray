import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        boolean creciente = true;
        boolean decreciente = true;

        System.out.println("Rellena el array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                decreciente = false;
            }
            if (array[i] > array[i + 1]) {
                creciente = false;
            }
        }

        if (creciente) {
            System.out.println("Los números están ordenados de forma creciente.");
        } else if (decreciente) {
            System.out.println("Los números están ordenados de forma decreciente.");
        } else {
            System.out.println("Los números están desordenados.");
        }
    }
}