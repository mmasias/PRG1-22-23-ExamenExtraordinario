import java.util.Scanner;

public class Commit3 {
    private static final int ROWS = 15;
    private static final int COLUMNS = 10;

    private static final int MAX_CELL_LENGTH = 6;
    private static final String EMPTY_CELL = "      ";

    private static final String[] COMMANDS = {"W", "A", "S", "D", "F", "V"};

    private static String[][] spreadsheet = new String[ROWS][COLUMNS];
    private static int currentRow = 0;
    private static int currentColumn = 0;

    public static void main(String[] args) {
        initializeSpreadsheet();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printSpreadsheet();
            printCurrentPosition();
            printCommands();

            String command = scanner.nextLine().toUpperCase();

            if (!isValidCommand(command)) {
                System.out.println("Comando inválido. Por favor, ingrese un comando válido.");
                continue;
            }

            if (command.equals("F")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            if (command.equals("V")) {
                System.out.print("Ingrese el texto para la celda: ");
                String text = scanner.nextLine();
                writeTextToCell(text);
            } else {
                moveCursor(command);
            }
        }

        scanner.close();
    }

    private static void initializeSpreadsheet() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                spreadsheet[i][j] = EMPTY_CELL;
            }
        }
    }

    private static void printSpreadsheet() {
        System.out.println(" Hoja de cálculo");
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(spreadsheet[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void printCurrentPosition() {
        System.out.println("Fila actual: " + (currentRow + 1));
        System.out.println("Columna actual: " + (currentColumn + 1));
        System.out.println();
    }

    private static void printCommands() {
        System.out.println("CMDS: [W]Arriba, [S] Abajo, [A] Izquierda, [D] Derecha, [F]Salir, [V]Escribir texto");
        System.out.println("Ingrese comando:");
