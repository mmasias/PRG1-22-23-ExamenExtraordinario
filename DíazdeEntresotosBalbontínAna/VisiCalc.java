import java.util.Scanner;

public class VisiCalc {
    public static void main(String[] args) {
        int filas = 15;
        int columnas = 10;

        Scanner scanner = new Scanner(System.in);
        boolean ejecucion = true;
        int filaActual = 0;
        int columnaActual = 0;
      

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
        // IMPRIMO EL MAPA
						// INICIO DEL PARSEO
						if      (VisiCalc[filas][columnas]==0)	{System.out.print(" + ");}	// Esquinas
						else if (VisiCalc[filas][columnas]==1)	{System.out.print("-");}	    // Paredes
						else if (VisiCalc[filas][columnas]==2)	{System.out.print("|");}	    // Espacios
						else if (VisiCalc[filas][columnas]==3)	{System.out.print("1");}	    // A
						else if (VisiCalc[filas][columnas]==4)	{System.out.print("2");}	    // B
						else if (VisiCalc[filas][columnas]==5)	{System.out.print("3");}	    // C
						else if (VisiCalc[filas][columnas]==6)	{System.out.print("4");}	    // D
                        else if (VisiCalc[filas][columnas]==7)	{System.out.print("1");}	    // E
						else if (VisiCalc[filas][columnas]==8)	{System.out.print("2");}	    // F
						else if (VisiCalc[filas][columnas]==9)	{System.out.print("3");}	    // G
						else if (VisiCalc[filas][columnas]==10)	{System.out.print("4");}	    // H
                        else if (VisiCalc[filas][columnas]==11)	{System.out.print("5");}	    // I
						else if (VisiCalc[filas][columnas]==12)	{System.out.print("6");}	    // J
                        else if (VisiCalc[filas][columnas]==13)	{System.out.print("7");}	    // E
						else if (VisiCalc[filas][columnas]==14)	{System.out.print("8");}	    // F
						else if (VisiCalc[filas][columnas]==15)	{System.out.print("9");}	    // G
						else if (VisiCalc[filas][columnas]==16)	{System.out.print("10");}	    // H

						// FIN DEL PARSEO
					
				
				System.out.println();
			


        while (ejecucion) {

            System.out.println("Posicion actual: Fila " + filaActual + ", Columna " + columnaActual);

            // Obtener el comando del usuario
            System.out.println("CMDs: [W]Arriba,[S]Abajo,[A]Izquierda,[D]Derecha,[F]Salir");
            System.out.println("Inserte comando: ");
            System.out.println("X: ["+filas+"] / Y: ["+columnas+"]");
            String comando = scanner.nextLine();
          
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
            } else if (comando.equalsIgnoreCase("Entrar")) {
                System.out.print("Ingrese un texto: ");
                String texto = scanner.nextLine();
            }

        //

    }
}