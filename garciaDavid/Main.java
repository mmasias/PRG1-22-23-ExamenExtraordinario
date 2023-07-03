public class Main {
    public static void main(String[] args) {
        int columna = 10;
        int fila = 15;
        int[][] excel = new int[fila][columna];
        inicializarExcel(excel);
        imprimirExcel(excel);
    }
    public static void inicializarExcel(int[][] excel) {
        for (int i = 0; i < excel.length; i++) {
            for (int j = 0; j < excel[i].length; j++) {
            }
        }

    }
    public static void imprimirExcel(int[][] excel) {
        for (int i = 0; i < excel.length; i++) {
            System.out.print("|");
            for (int j = 0; j < excel[i].length; j++) {
                System.out.print(excel[i][j] + "|");
            }
            System.out.println("");
        }
    }

}