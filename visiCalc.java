import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[][] hojaDeCalculo = new String[15][10];

        int[] posicionCursor = { 0, 0 };

        int limiteInferior = 0;
        int limiteSuperior = hojaDeCalculo.length - 1;
        int limiteIzquierdo = 0;
        int limiteDerecho = hojaDeCalculo[0].length - 1;

        boolean finAplicacion = false;

        do {
            imprimirEncabezado();
            for (int fila = 0; fila < hojaDeCalculo.length; fila++) {
                imprimirNumeroFila(fila);
                for (int columna = 0; columna < hojaDeCalculo[fila].length; columna++) {
                    String dato = hojaDeCalculo[fila][columna];
                    if (fila == posicionCursor[0] && columna == posicionCursor[1]) {
                        System.out.print("[" + formatoCelda(dato) + "]");
                    } else {
                        System.out.print(" " + formatoCelda(dato) + " ");
                    }
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println("+" + "-".repeat(62) + "+");

            String inputUsuario = entrada.nextLine();
            char comando = inputUsuario.length() > 0 ? inputUsuario.charAt(0) : ' ';
            
            if (comando == 'i') {
                System.out.print("Introduce el dato: ");
                String dato = entrada.nextLine();
                hojaDeCalculo[posicionCursor[0]][posicionCursor[1]] = dato;
            }
            
            switch (comando) {
                case 's':
                    posicionCursor[0] = Math.min(posicionCursor[0] + 1, limiteSuperior);
                    break;
                case 'w':
                    posicionCursor[0] = Math.max(posicionCursor[0] - 1, limiteInferior);
                    break;
                case 'a':
                    posicionCursor[1] = Math.max(posicionCursor[1] - 1, limiteIzquierdo);
                    break;
                case 'd':
                    posicionCursor[1] = Math.min(posicionCursor[1] + 1, limiteDerecho);
                    break;
                case 'f':
                    finAplicacion = true;
                    break;
            }

        } while (!finAplicacion);
    }

    static void imprimirGrafico(int assetID) {
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
        if (fila == 10) {
            System.out.print("|" + (filaHoja) + "|");
        } else {
            System.out.print(pared + (filaHoja) + "|");
        }
    }

    static String formatoCelda(String dato) {
        if (dato == null) {
            return "      ";
        } else if (dato.length() < 6) {
            return " ".repeat(6 - dato.length()) + dato;
        } else {
            return dato.substring(0, 6);
        }
    }
}
