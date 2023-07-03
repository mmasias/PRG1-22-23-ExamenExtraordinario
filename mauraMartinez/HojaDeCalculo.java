
import java.util.Scanner;

public class HojaCalculo {

    
    
    public static void main(String[] args) {

        Sacanner entrada = new Scanner(System.in);

        int[][] hojaCalculo = new int [15][10];
        boolean salirDelSistema = false; 
        int filaActual = 0;
        int columnaActual = 0;
        int filas=15;
        int columnas = 10; 
        


       while(true){

            imprimeHojaCalculo(hojaCalculo);
            

           


           System.out.println("Posición actual: (" + filaActual + ", " + columnaActual + ")");
           System.out.println("Valor actual: " + hojaCalculo[filaActual][columnaActual]);
           System.out.print("Ingrese un comando (w/a/s/d) o presione Enter para entrar o F para salir del sistema: ");
         
           String comando = entrada.nextLine().charAt(0);
           if (command.equals("w")) {
                filaActual--;
            } else if (commando.equals("s")) {
                filaActual++;
            } else if (commando.equals("a")) {
                columnaActual--;
            } else if (commando.equals("d")) {
                columnaActual++;
            } else if (commando.equals("enter")) {
                System.out.print("Valor: ");
                String value = scanner.nextLine();
                hojaCalculo[filaActual][columnaActual] = value;
            }

            if(filaActual>=0 && filaActual < filas && columnaActual >= 0 && columnaActual < columnas){
                System.out.println("Posición válida.");
            }else {
                System.out.println("Posición inválida. Los límites son 0-" + (filas - 1) + " para filas y 0-" + (columnas - 1) + " para columnas.");
            }
           

    }

    private static String completarConEspacios(String inputUsuario){
        if (input.length() > 6) {
            return input.substring(0, 6);
        } else if (input.length() < 6) {
            return String.format("%6s", input);
        }
        return input;
    }

    public static void imprimirHojaCalculo(String[][] hojaCalculo) {
    for (String[] fila : hojaCalculo) {
        for (String celda : fila) {
            String valorDeCelda = (celda == null) ? "" : celda;
            valorDeCelda = (valorDeCelda.length() > 6) ? valorDeCelda.substring(0, 6) : String.format("%-6s", valorDeCelda);
            System.out.print(valorDeCelda + " ");
        }
        System.out.println();
    }
    System.out.println();
}

        
    
        
    

    

}
           
           
           
           
}
            
        


       
                
                
            
            
        


       



        
         

        
