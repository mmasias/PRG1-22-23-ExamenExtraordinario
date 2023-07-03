import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float [][] hojaCalculo = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        int[][] posicion= new int[0][0];
        int movimiento;
        do {

            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(hojaCalculo[i][j] + " ");
                }
                System.out.println();
            }
            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce la acción que quieres hacer");
            System.out.println("W. Arriba");
            System.out.println("S. Abajo");
            System.out.println("A. Izquierda");
            System.out.println("D. Derecha");
            System.out.println("F. Concluir");

            movimiento= entrada.nextInt();

            switch (movimiento){
                case 'W':
                    posicion[0][1]=posicion[0][1]-1;
                    break;
                case 'S':
                    posicion[0][1]=posicion[0][1]+1;
                    break;
                case 'A':
                    posicion[0][0]=posicion[0][0]-1;
                    break;
                case 'D':
                    posicion[0][0]=posicion[0][0]+1;
                    break;
                case 'F':
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        }while ()


    }
}
