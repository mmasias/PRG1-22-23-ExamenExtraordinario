import java.util.Scanner;

public class visiCalc {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Array de 15x10
        String[][] hojaCalculo = new String[15][10];
        //Inicializar hoja de calculo
        inicializar(hojaCalculo);



    }

    //Inicializar hoja de calculo
    public static void inicializar(String hojaCalculo[][]){
        for(int i=0;i<hojaCalculo.length;i++){
            for(int j=0;j<hojaCalculo[i].length;j++){
                hojaCalculo[i][j]="";
            }

        }
    }

    //Imprimir hoja de calculo
    public static void imprimir(String hojaCalculo[][]){
        for(int i=0;i<hojaCalculo.length;i++){
            for(int j=0;j<hojaCalculo[i].length;j++){
                System.out.print(hojaCalculo[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //Desplazarse por la hoja de calculo
    public static void desplazarse{




    }

}