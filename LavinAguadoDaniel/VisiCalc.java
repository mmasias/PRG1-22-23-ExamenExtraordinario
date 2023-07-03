import java.util.Scanner;

public class VisiCalc {
    private static final int NUM_COLUMNAS = 10;
    private static final int NUM_FILAS = 15;
    private static final int LONGITUD_CELDA = 6;

    private String[][] hojaCalculo;
    private int filaActual;
    private int columnaActual;

    public VisiCalc() {
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

}