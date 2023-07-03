package lopesBrenda;

import java.util.Scanner;
public class VisiCalc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        int[][] hojaCalc = {
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},

        };
        int[] posicionUsuario = {0, 1};

        do {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|  A   |  B   |  C   |  D   |  E   |  F   |  G   |  H   |  I   |  J   |");
            System.out.println("|---------------------------------------------------------------------|");
            for (int fila = 0; fila < hojaCalc.length; fila++) {
                for (int columna = 0; columna < hojaCalc[fila].length; columna++) {
                    if (fila == posicionUsuario[0] && columna == posicionUsuario[1]) {
                        System.out.print("{    }");
                    }  else {
                        if (hojaCalc[fila][columna] == 0) {
                            System.out.print("      ");
                        } else if (hojaCalc[fila][columna] == 1) {
                            System.out.print("|");
                        } else if (hojaCalc[fila][columna] == 2) {
                            System.out.print("------");
                        }
                    }
                }
                System.out.println();

            }
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("| X:"+posicionUsuario[0]+" |  Y:"+(posicionUsuario[1])+" |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("CMDS: [W]Arriba,[S]Abajo,[A]Izquierda,[D]Derecha,[E]Editar,[F]Salir");
            System.out.println("Ingrese comando:");


            inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S':
                    posicionUsuario[0] = posicionUsuario[0] + 1;
                    break;
                case 'w', 'W':
                    posicionUsuario[0] = posicionUsuario[0] - 1;
                    break;
                case 'a', 'A':
                    posicionUsuario[1] = posicionUsuario[1] - 2;
                    break;
                case 'd', 'D':
                    posicionUsuario[1] = posicionUsuario[1] + 2;
                    break;
                case 't', 'T':
                    posicionUsuario[1] = posicionUsuario[1] + 1;
                    break;
                case 'f', 'F':
                    terminar = true;
            }

        } while (!terminar);


    }
}
