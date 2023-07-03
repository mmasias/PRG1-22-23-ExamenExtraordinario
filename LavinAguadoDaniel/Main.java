import java.util.Scanner;

public class Main {
    static final int ARRIBA = 1;
    static final int ABAJO = 2;
    static final int IZQUIERDA = 3;
    static final int DERECHA = 4;

    static final int[][] MOVIMIENTOS = {
            {0, 0},
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}

    };

    public static int main(String[] args) {

        int [][] hojaCalculo=new int[15][10];
        private static int capturaMovimiento() {

            switch (preguntaChar()) {
                case 'S':
                    return ABAJO;
                case 'W':
                    return ARRIBA;
                case  'A':
                    return IZQUIERDA;
                case 'd', 'D', '6':
                    return DERECHA;
                case 'F':
                    return 5;
            }
            return 0;
        }
        static char preguntaChar() {
            System.out.println("Donde te vas a mover?");
            Scanner entrada = new Scanner(System.in);
            return entrada.next().charAt(0);
        }



































        System.out.println();
        System.out.println("+-------------------------------------------------------------------------+");
        System.out.println("RESUMEN:");
        System.out.println("se han atendido "  + " en el dia");
        System.out.println("han quedado " + " personas en la cola sin atender");
        System.out.println("ha habido "  + " minutos con nadie en la cola");
        System.out.println("se han vendido " + " articulos en el dia");
        System.out.println("+-------------------------------------------------------------------------+");
    }
}