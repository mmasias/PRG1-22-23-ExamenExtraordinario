import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada;
        int limiteInferior=10;
        int limiteSuperior=10;
        int[][] mapa = new int[limiteSuperior][limiteInferior];
        boolean terminar = false;
        int[] posicionInicial = { 1, 1 };
        entrada = new Scanner(System.in);


        int limiteInferior=0;
        int limiteSuperior=mapa.length-1;
        int limiteIzquierdo=0;
        int limiteDerecho=mapa[0].length-1;

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
        if (posicionInicial[0]<limiteInferior) {posicionInicial[0]=limiteSuperior;}
        if (posicionInicial[0]>limiteSuperior) {posicionInicial[0]=limiteInferior;}
        if (posicionInicial[1]<limiteIzquierdo) {posicionInicial[1]=limiteDerecho;}
        if (posicionInicial[1]>limiteDerecho) {posicionInicial[1]=limiteIzquierdo;}
        if (terminar) {
            System.out.println("Terminando programa");
        } else {
            System.out.println("Posicion actual: " + posicionInicial[0] + "," + posicionInicial[1]);
            System.out.println("Valor actual: " + mapa[posicionInicial[0]][posicionInicial[1]]);
        }
}
}