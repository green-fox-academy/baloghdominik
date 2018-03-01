public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdder(10));
    }

    private static int numberAdder(int n) {
        if (n == 0) {
            return n;
        } else {
            return n + numberAdder(n-1);
        }
    }
}