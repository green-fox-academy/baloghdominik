import java.util.Scanner;

public class MileToKMConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        System.out.println("How many miles do you want to convert into Km?");
        int mile = scanner.nextInt();
        double km = mile;

        km = (mile * 1.61);
        System.out.println("That is " + km  +" Km");
    }
}