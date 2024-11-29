/*Ejercicio 6: Crea un programa que declare un array de 10 elementos enteros. Después debe leer mediante el teclado 8
números que se pondrán en orden en dicho array (dejando sin valores las dos últimas posiciones del array. Para finalizar
 se deben pedir dos veces un número a almacenar y la posición en la que hacerlo, el algoritmo debe insertarlo en la
 posición indicada, desplazando los que estén detrás.*/

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDesplazamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos1 = 0, pos2 = 0, num1, num2;
        int[] array = new int[10];

        System.out.println("Ingresa 8 valores para el array: ");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("1º posicion y numero: ");
        pos1 = sc.nextInt();
        num1 = sc.nextInt();
        for (int i = 7; i >= pos1; i--) {
            array[i + 1] = array[i];
        }
        array[pos1] = num1;

        System.out.println("2º posicion y numero: ");
        pos2 = sc.nextInt();
        num2 = sc.nextInt();
        for (int i = 8; i >= pos2; i--) {
            array[i + 1] = array[i];
        }
        array[pos2] = num2;

        System.out.println("Array con posiciones desplazadas: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
