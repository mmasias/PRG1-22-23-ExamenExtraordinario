import java.util.Scanner;

public class Main {
    public static final int NUM_ROWS = 15;
    public static final int NUM_COLS = 10;
    private double[][] cells = new double[NUM_ROWS][NUM_COLS];

    private int currentRow = 0;
    private int currentCol = 0;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printCells();
            System.out.print("Introduce un comando (w/a/s/d para mover, f para salir, e para ingresar valor): ");
            String command = scanner.next();
            switch (command.toLowerCase()) {
                case "w":
                    if (currentRow > 0) {
                        currentRow--;
                    }
                    break;
                case "a":
                    if (currentCol > 0) {
                        currentCol--;
                    }
                    break;
                case "s":
                    if (currentRow < NUM_ROWS - 1) {
                        currentRow++;
                    }
                    break;
                case "d":
                    if (currentCol < NUM_COLS - 1) {
                        currentCol++;
                    }
                    break;

