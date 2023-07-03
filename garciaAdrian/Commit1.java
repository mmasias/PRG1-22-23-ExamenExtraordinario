import java.util.Scanner;

public class Commit1 {
    private static final int ROWS = 15;
    private static final int COLUMNS = 10;

    private static final int MAX_CELL_LENGTH = 6;
    private static final String EMPTY_CELL = "      ";

    private static final String[] COMMANDS = {"W", "A", "S", "D", "F"};

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
