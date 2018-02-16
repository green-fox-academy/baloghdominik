import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){

        System.out.println("Please write a number: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();


        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {


                if (c == r) {
                    System.out.print("%");
                } else if (r == 1 || r == rows || c == 1 || c == rows) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        
        }
    }