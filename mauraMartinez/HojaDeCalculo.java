import java.util.Scanner;

public class HojaCalculo{

    public static void main(String[] args){

        Sacanner entrada = new Scanner(System.in);

        int[][] Hoja = new int [15][10];
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
                case 's', 'S', '8':
                    
                    break;
                case 'w', 'W', '2':
                  
                    break;
                case 'a', 'A', '4':
                    
                    break;
                case 'd', 'D', '6':
                    
                    break;

                    case 'v', 'V':
                        skin= skin + 1;
  
               
                    case 'f', 'F':
                    salirDelSistema = true;
            }




        
         

        
    }
}
