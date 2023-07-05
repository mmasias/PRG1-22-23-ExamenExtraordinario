import java.util.Scanner;

public class VisiCalc{
    public static void main(String[] args) {
        int numeroColumnas = 10;
        int numeroFilas = 15;
        int columnaActual = 0;
        int filaActual= 0;
        String[][] excel = new String[numeroFilas][numeroColumnas];
        Scanner scanner = new Scanner(System.in);
        InicializarExcel(excel,numeroFilas,numeroColumnas);
        boolean corre = true;
        while (corre) {
            imprimirExcel(excel, filaActual, columnaActual);

            System.out.print("Ingrese un comando (w, a, s, d, f): ");
            String comando = scanner.nextLine();

            switch (comando) {
                case "w":
                    if (filaActual > 0) {
                        filaActual--;
                    }
                    break;
                case "a":
                    if (columnaActual > 0) {
                        columnaActual--;
                    }
                    break;
                case "s":
                    if (filaActual < numeroFilas - 1) {
                        filaActual++;
                    }
                    break;
                case "d":
                    if (columnaActual < numeroColumnas - 1) {
                        columnaActual++;
                    }
                    break;
                case "f":
                    corre = false;
                    break;
                default:
                    if (comando.length() > 6) {
                        excel[filaActual][columnaActual] = comando.substring(0, 6);
                    } else {
                        String cellValue = String.format("%6s", comando);
                        excel[filaActual][columnaActual] = cellValue;
                    }
                    break;
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    public static void imprimirExcel(String[][] excel, int filaActual, int columnaActual) {
        int numeroFilas = excel.length;
        int numeroColumnas = excel[0].length;

        System.out.println("Hoja de cálculo:");

        for (int Fila = 0; Fila < numeroFilas; Fila++) {
            for (int columna = 0; columna < numeroColumnas; columna++) {
                if (Fila == filaActual && columna == columnaActual) {
                    System.out.print("X");
                } else {
                    System.out.print("/l");
                }

                System.out.print(excel[Fila][columna]);
                System.out.print("/l");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("X: " + (filaActual + 1));
        System.out.println("Y: " + (columnaActual + 1));
        System.out.println();
    }
    public static void InicializarExcel(String[][]excel,int numeroFilas,int numeroColumnas){
        excel = new String[numeroFilas][numeroColumnas];
        for(int Fila=0;Fila<numeroFilas;Fila++){
            for(int Columna=0;Columna<numeroColumnas;Columna++){
                excel[Fila][Columna]="";
            }
        }
    }

}
