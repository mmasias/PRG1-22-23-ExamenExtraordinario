import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroColumna = 10;
        int numeroFila = 15;
        int columnaActual = 0;
        int filaActual = 0;
        int[][] excel = new int[numeroFila][numeroColumna];
        Scanner scanner= new Scanner(System.in);
        boolean corre= true;
        while (corre){
            imprimirExcel(excel, filaActual, columnaActual);

            System.out.println("Ingrese un comando (w, a, s, d, f): ");
            String comando= scanner.nextLine();
            switch (comando){
                case "w":
                    if (numeroFila>0){
                        numeroFila--;
                    }
                    break;
                case "a":
                    if (numeroColumna>0){
                        numeroColumna--;
                    }
                    break;
                case "s":
                    if (numeroFila<excel.length-1){
                        numeroFila++;
                    }
                    break;
                case "d":
                    if (numeroColumna<excel.length-1){
                        numeroColumna++;
                    }
                    break;
                case "f":
                    corre=false;
                    break;
                default:
                    System.out.println("Comando inválido.");
                    break;
            }
        }

    }
    public static void imprimirExcel(int[][] excel, int filaActual, int columnaActual){
        int numeroFila= excel.length;
        int numeroColumna= excel[0].length;
        System.out.println("Hoja de cálculo:");
        for(int Fila=0; Fila<numeroFila; Fila++){
            for(int Columna=0; Columna<numeroColumna; Columna++){
            }

        }
    }

}



