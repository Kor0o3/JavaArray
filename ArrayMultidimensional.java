public class Ejemplo {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.print(matriz[fila][col]);
            }
        }

    }
}
