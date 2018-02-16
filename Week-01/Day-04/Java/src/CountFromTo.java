import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int n1 = scanner.nextInt();
        System.out.println("Second number: ");
        int n2 = scanner.nextInt();

        if (n2 < n1 || n1 == n2) {
            System.out.println("The second number must be bigger than the first!");
        }

        for (int n0 = n1; n0 <= n2; n0++) {
            System.out.println(n0);
        }
    }
}