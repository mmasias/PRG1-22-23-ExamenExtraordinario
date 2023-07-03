import java.util.Scanner;

public class visiCalc {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int filas = 15;
        int columnas = 10;
        String[][] hojaCalculo = new String[filas][columnas];
        inicializar(hojaCalculo);
        imprimirHoja(hojaCalculo);


    }


    public static void inicializar(String hojaCalculo[][]){
        for(int i=0;i<hojaCalculo.length;i++){
            for(int j=0;j<hojaCalculo[i].length;j++){
                hojaCalculo[i][j]="";
            }

        }
    }

    public static void imprimirHoja(String[][] hojaCalculo) {
        System.out.print("\t\t");
        for (int i = 0; i < hojaCalculo[0].length; i++) {
            System.out.print((char) ('A' + i) + "\t\t");
        }
        System.out.println();

        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < hojaCalculo.length; i++) {
            System.out.print(i + 1 + "\t|\t");
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                String cell = hojaCalculo[i][j];
                System.out.printf("%-6s\t|\t", cell);
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
        }
        System.out.println("CMDs: [W] Arriba, [S] Abajo, [A] Izquierda, [D] Derecha, [F] Salir - Ingrese comando:");


    }



}