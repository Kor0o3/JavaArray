import java.util.Scanner;

public class ArrayNoRepes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int num, posicion;

        System.out.println("Rellena el array");

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < array.length; i++) {
            num = sc.nextInt();
            boolean repetido = false;

            for (int j = 0; j < array.length; j++) {
                if (array[j] == num) {
                    repetido = true;
                }
            }

            if (repetido) {
                System.out.println("Repetido");
                i--;
            } else {
                array[i] = num;
            }
        }

        System.out.println("Introduce que numero quieres buscar");
        num = sc.nextInt();
        posicion = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                posicion = i;
            }
        }

        if (posicion != -1) {
            System.out.println("Posicion: " + array[posicion]);
        } else {
            System.out.println("No existe, posicion -1");
        }
    }
}
