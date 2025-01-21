import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos, num;
        int[] array = new int[10];

        System.out.println("Rellena los 8 valores: ");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("1º posicion y numero");
        pos = sc.nextInt();
        num = sc.nextInt();
        for (int i = 7; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = num;

        System.out.println("2º posicion y numero");
        pos = sc.nextInt();
        num = sc.nextInt();
        for (int i = 8; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = num;

        System.out.println("Resultado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
