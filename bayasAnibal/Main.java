import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        int[][] unaMatriz = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},

        };

        int[] posicion = {0, 0};

        int limiteInferior = 0;
        int limiteSuperior = unaMatriz.length - 1;
        int limiteIzquierdo = 0;
        int limiteDerecho = unaMatriz[0].length - 1;
        int skin = 0;

        do {
            for (int laFila = 0; laFila < unaMatriz.length; laFila++) {
                for (int laColumna = 0; laColumna < unaMatriz[laFila].length; laColumna++) {
                    if (laFila == posicion[0] && laColumna == posicion[1]) {

                        posicionActual(skin);
                    } else {
                        hojaCalculo(unaMatriz[laFila][laColumna], skin);
                    }
                }
                System.out.println();
            }
            System.out.println("Presione WASD para moverse, E para editar y F para terminar");

            inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S':
                    posicion[0] = posicion[0] + 1;
                    break;
                case 'w', 'W':
                    posicion[0] = posicion[0] - 1;
                    break;
                case 'a', 'A':
                    posicion[1] = posicion[1] - 1;
                    break;
                case 'd', 'D':
                    posicion[1] = posicion[1] + 1;
                    break;
                case 'E', 'e':
                    System.out.println("Ingrese el nuevo valor de la casilla");
                    unaMatriz[posicion[0]][posicion[1]] = entrada.nextInt();
                    String[] posActual= {entrada.nextLine()};
                    break;
                case 'f', 'F':
                    System.out.println("Fin de la hoja de calculo");
                    terminar = true;
            }

            if (posicion[0] < limiteInferior) {
                posicion[0] = limiteSuperior;
            }
            if (posicion[0] > limiteSuperior) {
                posicion[0] = limiteInferior;
            }
            if (posicion[1] < limiteIzquierdo) {
                posicion[1] = limiteDerecho;
            }
            if (posicion[1] > limiteDerecho) {
                posicion[1] = limiteIzquierdo;
            }

            if (unaMatriz[posicion[0]][posicion[1]] == 2) {
                unaMatriz[posicion[0]][posicion[1]] = 0;
            } else if (unaMatriz[posicion[0]][posicion[1]] == 4) {
                unaMatriz[posicion[0]][posicion[1]] = 0;
            }


        } while (!terminar);
    }

    static void hojaCalculo(int unTile, int skin) {

        String[][] terreno = {
                {" . ",},{}
        };
        System.out.print(terreno[unTile][skin]);
    }

    static void posicionActual(int skin) {
        String[] posActual= {" - "};
        System.out.print(posActual[skin]);
    }


}