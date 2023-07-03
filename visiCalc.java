import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean finAplicacion = false;

        int[][] hojaDeCalculo = new int[15][10];

        int[] posicionCursor = { 0, 0 };

        int limiteInferior=0;
        int limiteSuperior=hojaDeCalculo.length-1;
        int limiteIzquierdo=0;
        int limiteDerecho=hojaDeCalculo[0].length-1;

        do {
            imprimirEncabezado();
            for (int fila = 0; fila < hojaDeCalculo.length; fila++) {
                imprimirNumeroFila(fila);
                for (int columna = 0; columna < hojaDeCalculo[fila].length; columna++) {
                    if (fila == posicionCursor[0] && columna == posicionCursor[1]) {
                        System.out.print("[____]");
                    } else {
                        System.out.print("      ");
                    }
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println("+" + "-".repeat(62) + "+");

            inputUsuario = Character.toLowerCase(entrada.nextLine().charAt(0));
            switch (inputUsuario) {
                case 's':
                    posicionCursor[0] = posicionCursor[0] + 1;
                    break;
                case 'w':
                    posicionCursor[0] = posicionCursor[0] - 1;
                    break;
                case 'a':
                    posicionCursor[1] = posicionCursor[1] - 1;
                    break;
                case 'd':
                    posicionCursor[1] = posicionCursor[1] + 1;
                    break;
                case 'f':
                    finAplicacion = true;
            }

            if (posicionCursor[0]<limiteInferior) {posicionCursor[0]=limiteSuperior;}
            if (posicionCursor[0]>limiteSuperior) {posicionCursor[0]=limiteInferior;}
            if (posicionCursor[1]<limiteIzquierdo) {posicionCursor[1]=limiteDerecho;}
            if (posicionCursor[1]>limiteDerecho) {posicionCursor[1]=limiteIzquierdo;}

        } while (!finAplicacion);
    }

    static void imprimirGrafico(int assetID){
        String[][] graficos = {
            {"[____]", "+", "-", "|"}
        };
        System.out.print(graficos[assetID]);
    }

    static void imprimirEncabezado() {
      System.out.println("+" + "-".repeat(62) + "+");
      System.out.print("|  |");
      for (char letra = 'A'; letra < 'A' + 10; letra++) {
        System.out.print("    " + letra + "|");
      }
      System.out.println("\n+" + "-".repeat(62) + "+");
    }

    static void imprimirNumeroFila(int fila) {
        int filaHoja = fila + 1;
        String pared = (String.valueOf(filaHoja).length() < 2) ? "| " : "|";
        if (fila == 10){
            System.out.print( "|" + (filaHoja) + "|");
        } else {
            System.out.print( pared + (filaHoja) + "|");
        }
    }
}
