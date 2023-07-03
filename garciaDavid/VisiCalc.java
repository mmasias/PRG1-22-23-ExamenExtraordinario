import java.util.Scanner;

public class VisiCalc {
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
                    if (comando.length()>6){
                        excel[filaActual][columnaActual]= Integer.parseInt(comando.substring(0,6));
                    }else{
                        String valorCelda= String.format("%6s", comando);
                        excel[filaActual][columnaActual]= Integer.parseInt(valorCelda);
                    } break;
            }
            System.out.println("Programa finalizado.");
            scanner.close();

    }


        public static void imprimirExcel(int[][] excel, int filaActual, int columnaActual){
            int numeroFila= excel.length;
            int numeroColumna= excel[0].length;
            System.out.println("Hoja de cálculo:");
            for(int Fila=0; Fila<numeroFila; Fila++){
            for(int Columna=0; Columna<numeroColumna; Columna++){
                if (Fila==filaActual && Columna==columnaActual){
                    System.out.print("X");
                }else{
                    System.out.print("/l");
                }
                System.out.print(excel[Fila][Columna]);
                System.out.print("/l");
            }
            System.out.println();

        }
            System.out.println();
            System.out.println("X: " + (filaActual + 1));
            System.out.println("Y: " + (columnaActual + 1));
            System.out.println();
    }


}


}


