import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] hojaCalculo = new int[15][10];
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < hojaCalculo.length; i++) {
            for (int j = 0; j < hojaCalculo[i].length; j++) {
                hojaCalculo[i][j] = 0;

                System.out.println("+----------------------------------------------------+");
                System.out.println("|  |  A |  B |  C |  D |  E |  F |  G |  H |  I |  J |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("|  1|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  2|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  3|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  4|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  5|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  6|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  7|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  8|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("|  9|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("| 10|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("| 11|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("| 12|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("| 14|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("| 13|    |    |    |    |    |    |    |    |    |    |");
                System.out.println("+----------------------------------------------------+");
                int contadorX = 0;
                int contadorY = 0;
                System.out.println("|        |x " + contadorX + "|  |y: " + contadorY + "|                  |");
                System.out.println("+----------------------------------------------------+");
                System.out.println("[W] arriba, [A] izquierda, [S] abajo, [D] derecha, [F] insertar valor");

                System.out.println("Introduce una opción: ");
                switch (s.next()) {
                    case "w": {
                        j = j + 1;
                        break;
                    }
                    case "a": {
                        i = i - 1;
                        break;
                    }
                    case "s": {
                        j = j - 1;
                        break;
                    }
                    case "d": {
                        i = i + 1;
                        break;
                    }
                    case "f": {
                        for (int k = 0; k < hojaCalculo.length; k++) {
                            for (int l = 0; l < hojaCalculo[k].length; l++) {
                                hojaCalculo[k][l] = 0;
                                System.out.println("Introduce una palabra: ");
                                String palabra = s.next();
                                hojaCalculo[k][l] = palabra.charAt(0);

                                if (palabra.length() < 6) {
                                    System.out.println(palabra);
                                } else if (palabra.length() >= 6) {
                                    System.out.println(palabra.substring(0, 4));
                                }
                            }
                        }
                    }
                }

                contadorX = 0;
                if (s.next() == "d") {
                    contadorX++;
                } else if (s.next() == "a") {
                    contadorX--;
                }

                if (s.next() == "w") {
                    contadorY++;
                } else if (s.next() == "s") {
                    contadorY--;
                }


                if (i > 15 || j > 10) {
                    i = 1;
                    j = 1;
                } else if (i < 0 || j < 0) {
                    i = 14;
                    j = 9;
                }


            }
        }

    }

    }
