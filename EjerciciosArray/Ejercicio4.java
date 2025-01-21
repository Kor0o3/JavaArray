import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[12];
        int[] array2 = new int[12];
        int[] array3 = new int[24];

        System.out.println("Introduce la primera array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Introduce la segunda array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        for (int cont = 0; cont < 4; cont++) {
            array3[cont * 6] = array1[cont * 3];
            array3[cont * 6 + 1] = array1[cont * 3 + 1];
            array3[cont * 6 + 2] = array1[cont * 3 + 2];
            array3[cont * 6 + 3] = array2[cont * 3];
            array3[cont * 6 + 4] = array2[cont * 3 + 1];
            array3[cont * 6 + 5] = array2[cont * 3 + 2];
        }

        System.out.println("los valores del array 3 son: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}