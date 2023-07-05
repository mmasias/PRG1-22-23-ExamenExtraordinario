import java.util.Scanner;

public class visicalc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;
        String valor= "      ";
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

        int[] posicionInicial = { 0, 0 };

        do {
            for (int laFila = 0; laFila < 16; laFila++) {
                for (int laColumna = 0; laColumna < 11; laColumna++) {
                    if (laFila == posicionInicial[0] && laColumna == posicionInicial[1]) {
                        System.out.print("|[____]|");
                    } else if (laColumna == 10) {
                        System.out.print(valor+"|");
                    } else {
                            System.out.print("|"+valor);
                    }
                }
                System.out.println();
            }
            System.out.println("| X: " + posicionInicial[1] + " | Y: " + posicionInicial[0] + " |");
            System.out.println("CMDs: [W]Arriba,[S]Abajo,[A]Izquierda,[D]Derecha,[F]Salir");
            System.out.println("Ingrese comando: ");
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

        } while (!terminar);
    }
}