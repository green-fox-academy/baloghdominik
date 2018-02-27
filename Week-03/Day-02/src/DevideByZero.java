import java.util.Scanner;

public class DevideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        divided(divisor);
    }

    private static void divided(int divisor) {
        int result = 10 / divisor;
        if (result == 0) {
            System.out.println("fail");
        } else {
            System.out.println(result);
        }
    }
}