import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {
        int filas = 15;
        int columnas = 10;
        char[][] matriz = new char[filas][columnas];

        Scanner scanner = new Scanner(System.in);
        boolean ejecucion = true;
        int filaActual = 0;
        int columnaActual = 0;


        while (ejecucion) {

            System.out.println("Posicion actual: Fila " + filaActual + ", Columna " + columnaActual);

            // Obtener el comando del usuario
            System.out.println("CMDs: [W]Arriba,[S]Abajo,[A]Izquierda,[D]Derecha,[F]Salir");
            System.out.println("Inserte comando: ");
            String comando = scanner.nextLine();
        }
    }
}