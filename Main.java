import java.util.Scanner;

public class Main {
    private static final int NUM_COLUMNAS = 10;
    private static final int NUM_FILAS = 15;
    private static final int LONGITUD_CELDA = 6;

    private String[][] hojaCalculo;
    private int filaActual;
    private int columnaActual;

    public void Main(String[] args) {
        hojaCalculo = new String[NUM_FILAS][NUM_COLUMNAS];
        filaActual = 0;
        columnaActual = 0;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        while (ejecutando) {
            mostrarHojaCalculo();
            System.out.println("Fila: " + (filaActual + 1) + ", Columna: " + (columnaActual + 1));
            System.out.print("Comando: ");
            String comando = scanner.nextLine().trim();

            switch (comando.toLowerCase()) {
                case "W":
                    moverArriba();
                    break;
                case "S":
                    moverAbajo();
                    break;
                case "A":
                    moverIzquierda();
                    break;
                case "D":
                    moverDerecha();
                    break;
                case "F":
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Comando inválido. Inténtalo de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
    }

    private void mostrarHojaCalculo() {
        System.out.println("+----------------------------------------------------+");

        for (int fila = 0; fila < NUM_FILAS; fila++) {
            for (int columna = 0; columna < NUM_COLUMNAS; columna++) {
                String contenido = hojaCalculo[fila][columna];
                contenido = contenido != null ? contenido.substring(0, Math.min(contenido.length(), LONGITUD_CELDA)) : "";

                System.out.print("| " + completarCelda(contenido) + " ");
            }

            System.out.println("|");
            System.out.println("----------------------------------------------------");
        }
        System.out.println("+----------------------------------------------------+");
        System.out.println("        | X:" + filaActual + "| Y:" + columnaActual + "|");
        System.out.println("+----------------------------------------------------+");
        System.out.println("CMDs: [W] Arriba, [S] Abajo, [A] Izquierda, [D] Derecha, [F] Salir");
        System.out.println("Ingrese comando: ");
    }

    private String completarCelda(String contenido) {
        StringBuilder celdaCompleta = new StringBuilder(contenido);

        while (celdaCompleta.length() < LONGITUD_CELDA) {
            celdaCompleta.append(" ");
        }

        return celdaCompleta.toString();
    }

    private void moverArriba() {
        if (filaActual > 0) {
            filaActual--;
        } else {
            System.out.println("Ya estás en la primera fila.");
        }
    }

    private void moverAbajo() {
        if (filaActual < NUM_FILAS - 1) {
            filaActual++;
        } else {
            System.out.println("Ya estás en la última fila.");
        }
    }

    private void moverIzquierda() {
        if (columnaActual > 0) {
            columnaActual--;
        } else {
            System.out.println("Ya estás en la primera columna.");
        }
    }

    private void moverDerecha() {
        if (columnaActual < NUM_COLUMNAS - 1) {
            columnaActual++;
        } else {
            System.out.println("Ya estás en la última columna.");
        }
    }

}