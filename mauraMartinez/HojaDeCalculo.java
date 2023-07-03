import java.util.Scanner;

public class HojaCalculo{

    public static void main(String[] args){

        Sacanner entrada = new Scanner(System.in);

        int[][] hojaCalculo = new int [15][10];
        char inputUsuario;
        boolan salirDelSistema = false; 
        int filaActual = 0;
        int columnaActual = 0;
        int filas=15;
        int columnas = 10; 
        


        do{
            
            System.out.println("Posición actual: (" + filaActual + ", " + columnaActual + ")");
            System.out.println("Valor actual: " + hojaCalculo[filaActual][columnaActual]);
            System.out.print("Ingrese un comando (w/a/s/d) o presione Enter para entrar o F para salir del sistema: ");
            String comando = scanner.nextLine();
              if (!comando.isEmpty()) {
                hojaCalculo[filaActual][columnaActual] = completarConEspacios(comando);
            }
            
        


        inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 'w', 'W':
                    if(filaActual>0){
                        fila--;
                    }
                    break;
                    
                case 'a', 'A':
                    if (columnaActual > 0) {
                    columnaActual--;
                }
                  
                    break;
                case 's', 'S':
                   if (filaActual < hojaCalculo.length - 1) {
                    filaActual++;
                }
                    break;
                    
                case 'd', 'D':
                    if (columnaActual < hojaCalculo[0].length - 1) {
                    columnaActual++;
                }
                    
                    break;
                      
                 case 'f', 'F':
                    salirDelSistema = true;
  
               
            }

        if(filaActual>=0 && filaActual < filas && columnaActual >= 0 && columnaActual < columnas){
             System.out.println("Posición válida.");
        }else {
              System.out.println("Posición inválida. Los límites son 0-" + (filas - 1) + " para filas y 0-" + (columnas - 1) + " para columnas.");
        }

        }while(!salirDelSistema);

        private static String completarConEspacios(String input) {
        if (input.length() > 6) {
            return input.substring(0, 6);
        } else if (input.length() < 6) {
            return String.format("%6s", input);
        }
        return input;
    }



        
         

        
    }
}
