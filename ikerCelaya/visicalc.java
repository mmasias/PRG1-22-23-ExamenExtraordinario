import java.util.Scanner;

public class visicalc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        int posicionX, posicionY;
        boolean terminar = false;

        int[][] unaMatriz = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1 },
                { 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 },
                { 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 0 },
                { 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1 },
                { 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1 },
                { 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1 },
                { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1 },
                { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        int[] posicionInicial = { 1, 1 };

        do {
            for (int laFila = 0; laFila < unaMatriz.length; laFila++) {
                for (int laColumna = 0; laColumna < unaMatriz[laFila].length; laColumna++) {
                    if (laFila == posicionInicial[0] && laColumna == posicionInicial[1]) {
                        System.out.print("[____]");
                    } else {
                        if (unaMatriz[laFila][laColumna] == 0) {
                            System.out.print(" ");
                        } else if (unaMatriz[laFila][laColumna] == 1) {
                            System.out.print("#");
                        } else if (unaMatriz[laFila][laColumna] == 2) {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }

            inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S':
                    posicionInicial[0] = posicionInicial[0] + 1;
                    break;
                case 'w', 'W':
                    posicionInicial[0] = posicionInicial[0] - 1;
                    break;
                case 'a', 'A':
                    posicionInicial[1] = posicionInicial[1] - 1;
                    break;
                case 'd', 'D':
                    posicionInicial[1] = posicionInicial[1] + 1;
                    break;
                case 'f', 'F':
                    terminar = true;
            }

            if (unaMatriz[posicionInicial[0]][posicionInicial[1]] == 2){
                unaMatriz[posicionInicial[0]][posicionInicial[1]]=0;
            }


        } while (!terminar);
    }
}