import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[20];
        int puesto = 0;

        System.out.println("Ingresa numeros array1: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Ingresa numeros array2: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        Arrays.sort(array2);
        System.out.println("Ordenada: ");

        for (int a = 0; a < array.length; a++) {
            array3[puesto] = array[a];
            puesto++;
        }

        for (int b = 0; b < array2.length; b++) {
            array3[puesto++] = array2[b];
        }
        Arrays.sort(array3);

        System.out.println(Arrays.toString(array3));
    }
}