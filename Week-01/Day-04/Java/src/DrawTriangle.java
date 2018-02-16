import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){

        System.out.println("Please write a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String star = "*";

        for (int i = 0; i < num; i++){
            System.out.println(star);
            star += "*";
        }
    }
}