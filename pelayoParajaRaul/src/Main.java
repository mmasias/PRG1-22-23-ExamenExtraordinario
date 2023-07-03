import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada;
        int alto=10;
        int ancho=15;
        int[][] mapa = new int[alto][ancho];
        boolean terminar = false;
        int[] posicionInicial = { 1, 1 };
        entrada = new Scanner(System.in);


        int limiteIzquierdo=0;
        int limiteDerecho=mapa[0].length-1;



        imprimirMapa(mapa);
        System.out.println("Posicion actual: " + posicionInicial[0] + "," + posicionInicial[1]);
        comandos();



        char inputUsuario = entrada.nextLine().charAt(0);
        switch (inputUsuario) {
            case 's', 'S' -> posicionInicial[0] = posicionInicial[0] + 1;
            case 'w', 'W' -> posicionInicial[0] = posicionInicial[0] - 1;
            case 'a', 'A'  -> posicionInicial[1] = posicionInicial[1] - 1;
            case 'd', 'D'  -> posicionInicial[1] = posicionInicial[1] + 1;
            case 'v', 'V' -> {
                System.out.println("Ingrese el valor de la casilla");
                int valor = entrada.nextInt();
                mapa[posicionInicial[0]][posicionInicial[1]] = valor;

            }
            case 'f', 'F' -> terminar = true;
    }
        if (posicionInicial[0] < limiteIzquierdo) {
            posicionInicial[0] = limiteIzquierdo;
        } else if (posicionInicial[0] > limiteDerecho) {
            posicionInicial[0] = limiteDerecho;
        }

        if (terminar) {
            System.out.println("Terminando programa");
        } else {
            System.out.println("Posicion actual: " + posicionInicial[0] + "," + posicionInicial[1]);
            System.out.println("Valor actual: " + mapa[posicionInicial[0]][posicionInicial[1]]);
        }
}
    public static void imprimirMapa(int[][] mapa) {
        for (int[] fila : mapa) {
            for (int casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
        }
    }


    public static void comandos() {
        System.out.println("Comandos: ");
        System.out.println("W: Arriba");
        System.out.println("S: Abajo");
        System.out.println("A: Izquierda");
        System.out.println("D: Derecha");
        System.out.println("F: Finalizar");
    }

    


}