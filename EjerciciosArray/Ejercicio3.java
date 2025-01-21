import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, posicion = 0;
        int[] array = new int[10];

        do {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            array[posicion] = num;
            posicion++;
        } while (posicion < array.length);

        for (int contador = 0; contador < array.length/2; contador++) {
            System.out.print(array[contador] + " ");
            System.out.print(array[array.length-1-contador] + " "); //[contador+length/2]
        }
    }
}