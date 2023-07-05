import java.util.Scanner;

public class visiCalc {

    public static void main(String[] args) {

        int filas = 15;
        int columnas = 10;
        int filaActual = 0;
        int columnaActual = 0;

        String[][] hojaCalculo = new String[filas][columnas];
        inicializar(hojaCalculo);

        Scanner scanner = new Scanner(System.in);
        String Comando;

        while (true) {

            imprimirHoja(hojaCalculo);
            imprimirCeldaActual(filaActual, columnaActual);


            System.out.print("CMDs: [W] Arriba, [S] Abajo, [A] Izquierda, [D] Derecha, [E] Escribir,E [F] Salir - Ingrese comando:");
            Comando = scanner.nextLine().trim().toUpperCase();


            if (Comando.equals("W")) {
                if (filaActual > 0) {
                    filaActual--;
                }
            } else if (Comando.equals("A")) {
                if (columnaActual > 0) {
                    columnaActual--;
                }
            } else if (Comando.equals("S")) {
                if (filaActual < filas - 1) {
                    filaActual++;
                }
            } else if (Comando.equals("D")) {
                if (columnaActual < columnas - 1) {
                    columnaActual++;
                }
            }else if (Comando.equals("E")) {
                    editar(hojaCalculo, filaActual, columnaActual, scanner);
            } else if (Comando.equals("F")) {
                break;
            } else {
                // Escribir en la celda actual
                if (filaActual < filas && columnaActual < columnas) {
                    String input = Comando.length() > 6 ? Comando.substring(0, 6) : Comando;
                    hojaCalculo[filaActual][columnaActual] = input;
                }
            }


        }

        System.out.println("Programa finalizado.");

    }



    public static void inicializar(String hojaCalculo[][]) {
        for (int i = 0; i < hojaCalculo.length; i++) {
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                hojaCalculo[i][j] = "";
            }

        }
    }

    public static void imprimirHoja(String[][] hojaCalculo) {
        System.out.print("\t\t");
        for (int i = 0; i < hojaCalculo[0].length; i++) {
            System.out.print((char) ('A' + i) + "\t\t\t");
        }
        System.out.println();

        System.out.print("\t\t");
        for (int i = 0; i < hojaCalculo[0].length; i++) {
            System.out.print("--------\t");
        }
        System.out.println();

        for (int i = 0; i < hojaCalculo.length; i++) {
            System.out.print(i + 1 + "\t|\t");
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                String Celda = hojaCalculo[i][j];
                if (Celda.length() < 6) {
                    Celda = String.format("%6s", Celda);
                } else {
                    Celda = Celda.substring(0, 6);
                }
                System.out.printf("%-6s\t|\t", Celda);
            }
            System.out.println();
            System.out.print("\t|\t");
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                System.out.print("--------\t");
            }
            System.out.println();
        }
        System.out.println();


    }

    public static void imprimirCeldaActual(int fila, int columna){

        char Letra = (char) ('A' + columna);
        int Numero = fila + 1;
        System.out.println("Celda actual: " + Letra + Numero);
        System.out.println();



    }

    public static void editar(String[][] hojaCalculo, int fila, int columna, Scanner scanner) {
        System.out.print("Ingrese el nuevo valor para la celda: ");
        String nuevoValor = scanner.nextLine().trim();
        hojaCalculo[fila][columna] = nuevoValor;
        System.out.println("El valor de la celda ha sido actualizado.");


    }

}