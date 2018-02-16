public class FizzBuzz {
    public static void main(String[] args) {

        int k = 0;
        int f = 0;
        int b = 0;

        for (int i = 0; i <= 100; i++) {

            f = k % 3;
            boolean fizz = f == 0;

            b = k % 5;
            boolean buzz = b == 0;

            if (fizz == true && buzz == false) {
                System.out.println("Fizz");
            } else if (fizz == false && buzz == true) {
                System.out.println("Buzz");
            } else if (fizz == true && buzz == true) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(k);
            }

            k++;
        }
    }
}