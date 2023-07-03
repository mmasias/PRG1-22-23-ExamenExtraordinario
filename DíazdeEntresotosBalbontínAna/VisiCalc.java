import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {
        int filas = 15;
        int columnas = 10;

        Scanner scanner = new Scanner(System.in);
        boolean ejecucion = true;
        int filaActual = 0;
        int columnaActual = 0;
        String texto = scanner.nextLine();
        String comando= scanner.nextLine();

        //tengo que dibujar la matriz
       int[][] matrizCalc = {
			{2,1,1,1,1,1,1,1,1,2},
			{2,8,8,0,0,0,0,0,0,2},
			{2,8,0,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,0,0,2},
			{2,5,5,5,5,0,0,0,5,2},
			{2,0,0,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,0,0,2},
			{2,0,1,1,1,0,0,0,1,2},
			{2,0,1,1,1,1,2,1,1,2},
			{2,0,0,1,0,0,0,0,0,2},
			{2,0,0,1,0,0,0,0,0,2},
			{2,1,1,1,1,1,1,1,1,2},
        
        };


        while (ejecucion) {

            System.out.println("Posicion actual: Fila " + filaActual + ", Columna " + columnaActual);

            // Obtener el comando del usuario
            System.out.println("CMDs: [W]Arriba,[S]Abajo,[A]Izquierda,[D]Derecha,[F]Salir");
            System.out.println("Inserte comando: ");
            comando = scanner.nextLine();        
        }

        // INICIO DEL PARSEO
						if      ( matrizCalc[filas][columnas]==0)	{System.out.print(" + ");}	// ESQUINAS
						else if ( matrizCalc[filas][columnas]==1)	{System.out.print("-");}	    // PAREDES
						else if ( matrizCalc[filas][columnas]==2)	{System.out.print("|");}	    // SEPARADORES
					
						
						// FIN DEL PARSEO
					}
				}
				System.out.println();

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
          } else if (comando.equalsIgnoreCase("Entrar")) {
                System.out.print("Ingrese un texto: ");
                texto = scanner.nextLine();

               
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
}