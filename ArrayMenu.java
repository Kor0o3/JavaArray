/*Ejercicio 12: Para calcular la nota del módulo de programación deberemos desarrollar una aplicación.
Para llevar a cabo la fase de testeo, supondremos que este módulo cuenta con tan sólo 5 alumnos.
        MENU
        =====
        1) Introducir notas del primer trimestre
        2) Introducir notas del segundo trimestre
        3) Introducir notas del tercer trimestre
        4) Mostrar las notas medias de todos los alumnos
        5) Mostrar la nota media de un alumno en concreto.
        6) Salir
Las opciones 1, 2 y 3 servirán para leer las notas de los 5 alumnos en cada uno de los trimestres.
La 4 mostrará las notas medias de todos los alumnos del módulo y la opción 5 sólo muestra la de un alumno en concreto.
Cuando la aplicación comienza todas las notas de todos los alumnos en todos los trimestres es 0.
*/

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, alumno, suma1 = 0, suma2 = 0, suma3 = 0;
        double media1, media2, media3, mediaAmbos;
        int[] trimestre1 = new int[5];
        int[] trimestre2 = new int[5];
        int[] trimestre3 = new int[5];

        do {
            System.out.println("MENU");
            System.out.println("========================================================");
            System.out.println("1) Introducir notas del primer trimestre");
            System.out.println("2) Introducir notas del segundo trimestre");
            System.out.println("3) Introducir notas del tercer trimestre");
            System.out.println("4) Mostrar las notas medias de todos los alumnos");
            System.out.println("5) Mostrar la nota media de un alumno en concreto");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introducir notas del primer trimestre");
                    for (int i = 0; i < trimestre1.length; i++) {
                        trimestre1[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Introducir notas del segundo trimestre");
                    for (int i = 0; i < trimestre2.length; i++) {
                        trimestre2[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Introducir notas del tercer trimestre");
                    for (int i = 0; i < trimestre3.length; i++) {
                        trimestre3[i] = sc.nextInt();
                    }
                    break;

                case 4:

                    for (int i = 0; i < trimestre1.length; i++) {
                        suma1 = suma1 + trimestre1[i];
                    }
                    media1 = suma1 / trimestre1.length;

                    for (int i = 0; i < trimestre2.length; i++) {
                        suma2 = suma2 + trimestre2[i];
                    }
                    media2 = suma2 / trimestre2.length;

                    for (int i = 0; i < trimestre3.length; i++) {
                        suma3 = suma3 + trimestre3[i];
                    }
                    media3 = suma3 / trimestre3.length;

                    mediaAmbos = (media1 + media2 + media3) / 3;
                    System.out.println(media1);
                    System.out.println(media2);
                    System.out.println(media3);
                    System.out.println(mediaAmbos);
                    break;

                case 5:
                    alumno = sc.nextInt();
                    System.out.println("Nota media de alumno" + (alumno + 1));
                    mediaAmbos = (trimestre1[alumno]+trimestre2[alumno]+trimestre3[alumno])/3;
                    System.out.println(mediaAmbos);
                    break;
            }
        } while (opcion != 6);

    }
}
