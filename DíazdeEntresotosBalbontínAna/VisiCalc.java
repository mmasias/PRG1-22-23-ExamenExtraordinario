import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {
        int filas = 15;
        int columnas = 10;
        int maxFila, maxColumna, minFila, minColumna; 

        Scanner scanner = new Scanner(System.in);
        boolean ejecucion = true;
        int filaActual = 0;
        int columnaActual = 0;
        String texto = scanner.nextLine();
        String comando= scanner.nextLine();
      

        //tengo que dibujar la matriz
        int[][] VisiCalc = {
			{2,1,1,1,1,1,1,1,1,2},
			{2,1,2,1,1,1,1,2,0,2},
			{2,1,2,2,2,2,2,2,2,2},
			{2,1,2,2,2,2,2,2,2,2},
			{2,1,1,1,1,1,0,0,0,2},
			{2,1,0,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,1,4,2,2},
			{2,2,1,0,0,0,0,2,3,2},
			{2,0,1,0,0,0,0,2,3,2},
			{2,0,1,0,0,0,0,4,3,2},
			{2,1,3,3,3,3,3,3,3,2},
			{2,3,3,0,0,0,1,4,3,2},
			{2,0,1,0,0,0,0,3,3,2},
			{2,0,1,0,0,0,0,3,3,2},
			{2,1,1,1,1,1,1,1,1,2},
			
		};

        

        while (ejecucion) {

            System.out.println("Posicion actual: Fila " + filaActual + ", Columna " + columnaActual);

            // Obtener el comando del usuario
            System.out.println("CMDs: [W]Arriba,[S]Abajo,[A]Izquierda,[D]Derecha,[F]Salir");
            System.out.println("Inserte comando: ");
            System.out.println("X: ["+filas+"] / Y: ["+columnas+"]");  
            comando = scanner.nextLine();        
        }

        // Procesar el comando
       
            if (comando.equalsIgnoreCase("W")) {
                if (filaActual > 0) {
                    filaActual--;
                }
            } else if (comando.equalsIgnoreCase("A")) {
                if (columnaActual > 0) {
                    columnaActual--;
                }
            } else if (comando.equalsIgnoreCase("S")) {
                if (filaActual < filas - 1) {
                    filaActual++;
                }
            } else if (comando.equalsIgnoreCase("D")) {
                if (columnaActual < columnas - 1) {
                    columnaActual++;
                }
            }
               
        //Texto
            
            if (texto.length() <=6){

                System.out.println(texto);
            }

            if (texto.length()>6){


            }

            if (comando.equalsIgnoreCase("F")) {
                ejecucion = false;
            } 
             scanner.close();
        System.out.println("Ejecucion finalizada.");
    }
}