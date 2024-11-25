/*  Escribe un programa que almacene número enteros en un array.Para empezar el programa debe pedir el número de enteros que se van a almacenar.
    Una vez creado el array,el programa debe pedir una posición y un número entero a almacenar en esa posición.
    Si la posición dada fuera la-1 el programa debe acabar
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamArray, num , posicion;

        System.out.print("Introduce el tamaño del array: ");
        try {
            tamArray = sc.nextInt();
            int[] array = new int[tamArray];
            if (tamArray > 0) {
                do {
                    System.out.print("Introduce el numero de posicion del array que deseas cambiar: ");
                    posicion = sc.nextInt();

                    if (posicion >= 0 && posicion < tamArray) {
                        System.out.print("Introduce el numero que deseas incluir: ");
                        num = sc.nextInt();
                        if (num > 0) {
                            System.out.println("El valor " + num + " ha sido almacenado en la posicion " + posicion);
                            array[posicion] = num;
                        }
                    } else {
                        System.out.println("La posicion no es valida");
                    }
                } while (posicion > 0);
            }
            System.out.println("Debes introducir un valor valido (Ni negativos, ni 0)");

        } catch (InputMismatchException e) {
            System.out.print("Introduce solo numeros");

        } catch (NegativeArraySizeException a) {
            System.out.println("El tamaño del array no puede ser negativo");
        }
    }
}
