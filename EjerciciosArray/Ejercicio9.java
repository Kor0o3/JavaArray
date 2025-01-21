import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] array2 = new int[10];
        int puesto = 0;

        System.out.println("Rellena los valores: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                array2[puesto] = array[i];
                puesto++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array2[puesto++] = array[i];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}