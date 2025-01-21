import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] arrayP = new int[10];
        int[] arrayIM = new int[10];
        int contP = 0, contIM = 0;

        System.out.println("Rellena los valores: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                arrayP[contP] = array[i];
                contP++;
            } else {
                arrayIM[contIM] = array[i];
                contIM++;
            }
        }

        System.out.println("Numero Pares: ");
        for (int i = 0; i < contP; i++) {
            System.out.print(arrayP[i] + " ");
        }

        System.out.println("\nNumero Impares: ");
        for (int i = 0; i < contIM; i++) {
            System.out.print(arrayIM[i] + " ");
        }
    }
}

