import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        int[][] unaMatriz = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2,},
                {1, 4, 1, 2, 1, 2, 2, 2, 1, 1,},
                {1, 2, 1, 2, 2, 2, 2, 2, 2, 2,},
                {1, 2, 1, 1, 1, 1, 2, 1, 1, 1,},
                {2, 2, 2, 2, 2, 1, 2, 1, 2, 2,},
                {1, 2, 2, 2, 2, 1, 2, 1, 1, 1,},
                {1, 2, 1, 2, 2, 1, 2, 2, 2, 2,},
                {1, 2, 1, 2, 2, 2, 2, 2, 2, 2,},
                {1, 4, 1, 1, 1, 1, 1, 1, 1, 1,},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2,},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,}
        };

        int[] posicion = {1, 1};




        int limiteInferior = 0;
        int limiteSuperior = unaMatriz.length - 1;
        int limiteIzquierdo = 0;
        int limiteDerecho = unaMatriz[0].length - 1;
        int movimiento;

        do {
            for (int laFila = 0; laFila < unaMatriz.length; laFila++) {
                for (int laColumna = 0; laColumna < unaMatriz[laFila].length; laColumna++) {


                }
                System.out.println();
            }
            System.out.println("Introduce la acción que quieres hacer");
            System.out.println("W. Arriba");
            System.out.println("S. Abajo");
            System.out.println("A. Izquierda");
            System.out.println("D. Derecha");
            System.out.println("E. Editar");
            System.out.println("F. Finalizar");
            movimiento = entrada.next().charAt(0);

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
                case 'd', 'D' :
                    posicion[1] = posicion[1] + 1;
                    break;
               case 'E', 'e':
                   System.out.println("Introduce el valor que quieres editar");

                    break;
                case 'f', 'F':
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





        } while (!terminar);
    }


}