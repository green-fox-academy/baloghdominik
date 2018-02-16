import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many IQ do you have?");

        int number = scanner.nextInt();

        switch (number) {
            case 0:  System.out.println("Not Enough");
                break;
            case 1:  System.out.println("One (That's not too much.)");
                break;
            case 2:  System.out.println("Two (That's not too much.)");
                break;
            default: System.out.println("Dude that's a lot!");
                break;
        }
    }
}
