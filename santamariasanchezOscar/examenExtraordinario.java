import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] hojaCalculo= new int[15][10];
        Scanner s= new Scanner(System.in);

        for (int i=0; i<hojaCalculo.length; i++){
            for (int j=0; j<hojaCalculo[i].length; j++){
                hojaCalculo[i][j]=0;

                switch (s.next()){
                    case "w"{
                        j=j+1;
                        break;
                    }
                    case "a"{
                    i=i-1;
                    break;
                    }
                    case"s"{
                    j=j-1;
                    break;
                    }
                    case "d"{
                    i=i+1;
                    break;
                    }
                    case "f"{
                    hojaCalculo[i][j]=s.nextInt();
                    }
                }

                if (i >15 || j>10){
                    System.out.println("Error");
                }
                
            }
        }

    }
}
