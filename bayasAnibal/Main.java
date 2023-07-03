import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        char[][] unaMatriz = {
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

        int[] Posicion = {0, 0};

        int limiteInferior = 0;
        int limiteSuperior = unaMatriz.length - 1;
        int limiteIzquierdo = 0;
        int limiteDerecho = unaMatriz[0].length - 1;
        int skin = 0;

        do {
            for (int laFila = 0; laFila < unaMatriz.length; laFila++) {
                for (int laColumna = 0; laColumna < unaMatriz[laFila].length; laColumna++) {
                    if (laFila == Posicion[0] && laColumna == Posicion[1]) {
                        imprimePacman(skin);
                    } else {
                        imprimeTerreno(unaMatriz[laFila][laColumna], skin);
                    }
                }
                System.out.println();
            }

            inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S', '8':
                    Posicion[0] = Posicion[0] + 1;
                    break;
                case 'w', 'W', '2':
                    Posicion[0] = Posicion[0] - 1;
                    break;
                case 'a', 'A', '4':
                    Posicion[1] = Posicion[1] - 1;
                    break;
                case 'd', 'D', '6':
                    Posicion[1] = Posicion[1] + 1;
                    break;
                case 'v', 'V':
                    skin = skin + 1;
                    if (skin > 2) {
                        skin = 0;
                    }
                    break;
                case 'f', 'F':
                    terminar = true;
            }

            if (Posicion[0] < limiteInferior) {
                Posicion[0] = limiteSuperior;
            }
            if (Posicion[0] > limiteSuperior) {
                Posicion[0] = limiteInferior;
            }
            if (Posicion[1] < limiteIzquierdo) {
                Posicion[1] = limiteDerecho;
            }
            if (Posicion[1] > limiteDerecho) {
                Posicion[1] = limiteIzquierdo;
            }

            if (unaMatriz[Posicion[0]][Posicion[1]] == 2) {
                unaMatriz[Posicion[0]][Posicion[1]] = 0;
            } else if (unaMatriz[Posicion[0]][Posicion[1]] == 4) {
                unaMatriz[Posicion[0]][Posicion[1]] = 0;
            }


        } while (!terminar);
    }

    static void imprimeTerreno(int unTile, int skin) {

        String[][] terreno = {
                {" . ",},

        };
        System.out.print(terreno[unTile][skin]);
    }

    static void imprimePacman(int skin) {
        String[] pacman = {" - "};
        System.out.print(pacman[skin]);
    }



}