package lopesBrenda;

import java.util.Scanner;
public class VisiCalc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        int[][] hojaCalc = {
                {1, 2, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 3, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 4, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 5, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 6, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 7, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 8, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 9, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 10, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 11, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 12, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 13, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 14, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 15, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 16, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},

        };
        int[] posicionUsuario = {1, 3};
        int limiteInferior=0;
        int limiteSuperior=hojaCalc.length-1;
        int limiteIzquierdo=3;
        int limiteDerecho=hojaCalc[0].length-2;


        do {
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("|  |  A   |  B   |  C   |  D   |  E   |  F   |  G   |  H   |  I   |  J   |");
            System.out.println("|------------------------------------------------------------------------|");
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
                            System.out.print("1 ");
                        } else if (hojaCalc[fila][columna] == 3) {
                            System.out.print("2 ");
                        } else if (hojaCalc[fila][columna] == 4) {
                            System.out.print("3 ");
                        } else if (hojaCalc[fila][columna] == 5) {
                            System.out.print("4 ");
                        } else if (hojaCalc[fila][columna] == 6) {
                            System.out.print("5 ");
                        } else if (hojaCalc[fila][columna] == 7) {
                            System.out.print("6 ");
                        } else if (hojaCalc[fila][columna] == 8) {
                            System.out.print("7 ");
                        } else if (hojaCalc[fila][columna] == 9) {
                            System.out.print("8 ");
                        } else if (hojaCalc[fila][columna] == 10) {
                            System.out.print("9 ");
                        } else if (hojaCalc[fila][columna] == 11) {
                            System.out.print("10");
                        } else if (hojaCalc[fila][columna] == 12) {
                            System.out.print("11");
                        } else if (hojaCalc[fila][columna] == 13) {
                            System.out.print("12");
                        } else if (hojaCalc[fila][columna] == 14) {
                            System.out.print("13");
                        } else if (hojaCalc[fila][columna] == 15) {
                            System.out.print("14");
                        } else if (hojaCalc[fila][columna] == 16) {
                            System.out.print("15");
                        }
                    }
                }
                System.out.println();

            }
            System.out.println("|------------------------------------------------------------------------|");
            System.out.println("| X:"+posicionUsuario[0]+" |  Y:"+(posicionUsuario[1])+" |");
            System.out.println("|------------------------------------------------------------------------|");
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

                    break;
                case 'f', 'F':
                    terminar = true;
            }

            if (posicionUsuario[0]<limiteInferior) {
                posicionUsuario[0] = limiteInferior;

            }else if (posicionUsuario[0]>limiteSuperior) {
                posicionUsuario[0]=limiteSuperior;

            }else if (posicionUsuario[1]<limiteIzquierdo) {
                posicionUsuario[1]=limiteIzquierdo;

            }else if (posicionUsuario[1]>limiteDerecho) {
                posicionUsuario[1]=limiteDerecho;
            }

        } while (!terminar);


    }
}
