package garciaLydia;

import java.util.Scanner;

public class VisiCalc{

     static final int COLUMNAS = 10;private static final int FILAS = 14;
    private
    private static String[][] hojaCalculo = new String[FILAS][COLUMNAS];
    private static int filaActual = 0;
    private static int columnaActual = 0;

    public static void main(String[] args) {

        for (int i = 0; i < FILAS; i++)
            for (int j = 0; j < COLUMNAS; j++)
                hojaCalculo[i][j] = "      ";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirHojaCalculo();

            String comando = "";
            while (!comando.equals("W") && !comando.equals("A") && !comando.equals("S") && !comando.equals("D") && !comando.equals("F")) {
                System.out.println("[W]Arriba; [A]Izquierda; [S]Abajo; [D]Derecha; [F]Finalizar. Ingrese comando: ");
                comando = scanner.nextLine().toUpperCase();

                if (!comando.equals("W") && !comando.equals("A") && !comando.equals("S") && !comando.equals("D") && !comando.equals("F"))
                    System.out.println("Letra incorrecta");
            }

            procesarComando(comando, scanner);
        }
    }

    public static void imprimirHojaCalculo() {
        System.out.print("   ");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.print("|   " + (char)('A' + j) + "  ");
        }
        System.out.println("|");

        for (int i = 0; i < FILAS; i++) {
            System.out.print((i+1) < 10 ? "  " + (i+1) : " " + (i+1));
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("|" + hojaCalculo[i][j]);
            }
            System.out.println("|");
        }

        System.out.println("Estás en la fila " + (filaActual + 1) + ", columna " + (char)('A' + columnaActual));
    }

    public static void procesarComando(String comando, Scanner scanner) {
        if (comando.equals("W")) {
            if (filaActual > 0)
                filaActual--;
            else
                System.out.println("¡Ya estás en la parte superior de la hoja!");
        } else if (comando.equals("A")) {
            if (columnaActual > 0)
                columnaActual--;
            else
                System.out.println("¡Ya estás en el borde izquierdo de la hoja!");
        } else if (comando.equals("S")) {
            if (filaActual < FILAS - 1)
                filaActual++;
            else
                System.out.println("¡Ya estás en la parte inferior de la hoja!");
        } else if (comando.equals("D")) {
            if (columnaActual < COLUMNAS - 1)
                columnaActual++;
            else
                System.out.println("¡Ya estás en el borde derecho de la hoja!");
        } else if (comando.equals("F")) {
            System.out.println("Finalizando el programa.");
            scanner.close();
            System.exit(0);
        }

        System.out.println("Ingresa el texto que desees poner en la celda seleccionada: ");
        String entrada = scanner.nextLine();

        if (entrada.length() > 6)
            entrada = entrada.substring(0, 6);
        else
            while (entrada.length() < 6)
                entrada = " " + entrada;

        hojaCalculo[filaActual][columnaActual] = entrada;
    }
}