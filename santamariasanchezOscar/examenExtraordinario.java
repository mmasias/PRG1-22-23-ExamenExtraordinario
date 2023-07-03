import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] hojaCalculo= new int[15][10];
        Scanner s= new Scanner(System.in);
       
        System.out.println(imprimirTabla());



        for (int i=0; i<hojaCalculo.length; i++){
            for (int j=0; j<hojaCalculo[i].length; j++){
                hojaCalculo[i][j]=0;

                switch (s.next()){
                    case "w":{
                        j=j+1;
                        break;
                    }
                    case "a":{
                    i=i-1;
                    break;
                    }
                    case"s":{
                    j=j-1;
                    break;
                    }
                    case "d":{
                    i=i+1;
                    break;
                    }
                    case "f":{
                    hojaCalculo[i][j]=s.nextInt();
                    }
                }

                if (i >15 || j>10){
                    System.out.println("Error");
                }



            }
        }

    }
    public static int imprimirTabla(){
       String[][] tabla= {
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
    }
    }

}
