import java.util.Scanner;

public class VisiCalc {
    private static final int NUM_COLUMNAS = 10;
    private static final int NUM_FILAS = 15;

    public static void main(String[] args) {
        String[][] hojaCalculo = new String[NUM_FILAS][NUM_COLUMNAS];
        String[][] etiquetasColumnas = generarEtiquetasColumnas();
        String[][] etiquetasFilas = generarEtiquetasFilas();
        int filaActual = 0;
        int columnaActual = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarHojaCalculo(hojaCalculo, etiquetasColumnas, etiquetasFilas, filaActual, columnaActual);
            System.out.print("Ingrese comamndo: ");
            String comando = scanner.nextLine().trim().toUpperCase();

            switch (comando) {
                case "W":
                    if (filaActual > 0) {
                        filaActual--;
                    } else {
                        System.out.println("No puedes moverte más arriba");
                    }
                    break;
                case "A":
                    if (columnaActual > 0) {
                        columnaActual--;
                    } else {
                        System.out.println("No puedes moverte más a la izquierda");
                    }
                    break;
                case "S":
                    if (filaActual < NUM_FILAS - 1) {
                        filaActual++;
                    } else {
                        System.out.println("No puedes moverte más abajo");
                    }
                    break;
                case "D":
                    if (columnaActual < NUM_COLUMNAS - 1) {
                        columnaActual++;
                    } else {
                        System.out.println("No puedes moverte más a la derecha");
                    }
                    break;
                case "F":
                    System.out.println("Programa finalizado");
                    return;
                default:
                    if (comando.length() <= 6) {
                        hojaCalculo[filaActual][columnaActual] = comando;
                    } else {
                        hojaCalculo[filaActual][columnaActual] = comando.substring(0, 6);
                    }
                    break;
            }
        }
    }

    private static void mostrarHojaCalculo(String[][] hojaCalculo, String[][] etiquetasColumnas, String[][] etiquetasFilas, int filaActual, int columnaActual) {
        System.out.println("+------------------------------------------------------------------------+");
        System.out.print("|" + "  ");
        for (int columna = 0; columna < NUM_COLUMNAS; columna++) {
            System.out.print("|   " + etiquetasColumnas[0][columna] + ("  "));
        }
        System.out.print("|");
        System.out.println();
        System.out.println("+--+------+------+------+------+------+------+------+------+------+------+");

        for (int fila = 0; fila < NUM_FILAS; fila++) {
            System.out.print("|" + etiquetasFilas[fila][0]);
            for (int columna = 0; columna < NUM_COLUMNAS; columna++) {
                String contenido = hojaCalculo[fila][columna];
                if (contenido == null) {
                    contenido = "      ";
                }
                System.out.print("|" + contenido);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("+--+------+------+------+------+------+------+------+------+------+------+");
        System.out.println("| Fila actual: " + etiquetasFilas[filaActual][0] + "                                                        |");
        System.out.println("| Columna actual: " + etiquetasColumnas[0][columnaActual] + "                                                      |");
        System.out.println("+------------------------------------------------------------------------+");
    }

    private static String[][] generarEtiquetasColumnas() {
        String[][] etiquetasColumnas = new String[1][NUM_COLUMNAS];
        for (int columna = 0; columna < NUM_COLUMNAS; columna++) {
            etiquetasColumnas[0][columna] = Character.toString((char) ('A' + columna));
        }
        return etiquetasColumnas;
    }

    private static String[][] generarEtiquetasFilas() {
        String[][] etiquetasFilas = new String[NUM_FILAS][1];
        for (int fila = 0; fila < NUM_FILAS; fila++) {
            etiquetasFilas[fila][0] = String.format("%2d", fila + 1);
        }
        return etiquetasFilas;
    }
}
