import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {
        final int NUM_COLUMNAS = 10;
        final int NUM_FILAS = 15;
        final int LONGITUD_MAXIMA = 6;
        String[][] hojaCalculo = new String[NUM_FILAS][NUM_COLUMNAS];
        int filaActual = 0;
        int columnaActual = 0;

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;

        do {
            System.out.println("Por favor seleciona alguno de los siguientes comandos (w/a/s/d) o f para finalizar el programa");
            inputUsuario = entrada.nextLine().charAt(0);

        switch (inputUsuario) {
                case 's', 'S':
                    
                    break;
                case 'w', 'W':
                
                    break;
                case 'a', 'A':

                    break;
                case 'd', 'D':
                
                    break;
                case 'f', 'F':
                    terminar = true;
            }
        } while (!terminar);

    }
}