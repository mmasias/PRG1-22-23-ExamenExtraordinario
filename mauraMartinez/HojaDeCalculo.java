import java.util.Scanner;

public class HojaCalculo{

    public static void main(String[] args){

        Sacanner entrada = new Scanner(System.in);

        int[][] hojaCalculo = new int [15][10];
        char inputUsuario;
        boolan salirDelSistema = false; 
        int filaActual = 0;
        int columnaActual = 0;
        


        do{
            System.out.println("Posición actual: (" + filaActual + ", " + columnaActual + ")");
            System.out.println("Valor actual: " + hojaCalculo[filaActual][columnaActual]);
            System.out.print("Ingrese un comando (w/a/s/d) o presione Enter para entrar o F para salir del sistema: ");
            String comando = scanner.nextLine();
            
        }while(!salirDelSistema);
        


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




        
         

        
    }
}
