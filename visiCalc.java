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
        int assetID=0;

        do {
            imprimirLetraColumna();
            for (int fila = 0; fila < hojaDeCalculo.length; fila++) {
                for (int columna = 0; columna < hojaDeCalculo[fila].length; columna++) {
                    if (fila == posicionCursor[0] && columna == posicionCursor[1]) {
                        imprimirGrafico(0);
                    } else {
                        System.out.print("      \t");
                    }
                }
                System.out.println();
            }

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

    static Void imprimirLetraColumna() {
      System.out.print("\t");
      for (char c = 'A'; c < 'A' + 10; c++) {
        System.out.print(c + "\t");
      }
      System.out.println();
    return null;
    }

}
