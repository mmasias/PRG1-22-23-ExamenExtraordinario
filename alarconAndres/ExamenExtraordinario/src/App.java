import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ingreso;
        int posFil = 0;
        int posCol = 1;
        String[] accion = { "w", "a", "s", "d", "f" };
        Boolean salir = false;
        String[] encabezado = { "  ", "   A  ", "   B  ", "   C  ", "   D  ", "   E  ", "   F  ", "   G  ", "   H  ",
                "   I  ", "   J  " };
        String[][] hoja = {
                { " 1", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 2", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 3", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 4", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 5", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 6", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 7", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 8", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { " 9", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { "10", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { "11", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { "12", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { "13", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " },
                { "14", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
                        "      " }
        };

        while (!salir) {
            System.out.println("+------------------------------------------------------------------------+");
            for (int pos = 0; pos < encabezado.length; pos++) {
                System.out.print("|");
                System.out.print(encabezado[pos]);
            }
            System.out.println("|");
            System.out.println("+--+------+------+------+------+------+------+------+------+------+------+");
            for (int filas = 0; filas < hoja.length; filas++) {
                for (int columnas = 0; columnas < hoja[0].length; columnas++) {
                    if ((filas == posFil) && (columnas == posCol)) {
                        System.out.print("|");
                        System.out.print("[____]");
                    } else {
                        System.out.print("|");
                        System.out.print(hoja[filas][columnas]);
                    }
                }
                System.out.println("|");
            }
            System.out.println("|--+------+------+------+------+------+------+------+------+------+------|");
            System.out.println("|HM|X:" + (posCol - 1) + "| Y:" + posFil);
            System.out.println("|------------------------------------------------------------------------|");
            System.out.println("CMDs: [w]:Arriba, [a]:Izquierda, [s]:Abajo, [d]:Derecha, [f]:Salir      ");
            System.out.print("Ingrese un comando: ");

            ingreso = scanner.nextLine();
            if (ingreso.equals(accion[0])) {
                if (posFil > 0) {
                    posFil = posFil - 1;
                }
            } else if (ingreso.equals(accion[1])) {
                if (posCol > 1) {
                    posCol = posCol - 1;
                }
            } else if (ingreso.equals(accion[2])) {
                if (posFil < hoja.length - 1) {
                    posFil = posFil + 1;
                }
            } else if (ingreso.equals(accion[3])) {
                if (posCol < hoja[0].length - 1) {
                    posCol = posCol + 1;
                }
            } else if (ingreso.equals(accion[4])) {
                salir = true;
            } else {
                
                if (ingreso.length() > 6) {
                hoja[posFil][posCol] = ingreso.substring(0, 6);
                }
                else if (ingreso.length() < 6) {
                    // make it so if is less than 6 it adds spaces
                    int spaces = 6 - ingreso.length();
                    for (int i = 0; i < spaces; i++) {
                        ingreso = " " + ingreso;
                    }
                    hoja[posFil][posCol] = ingreso;
                } else {
                    hoja[posFil][posCol] = ingreso;
                }

            }
        }

    }
}