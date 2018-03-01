public class Power {
    public static int z = 0;
    public static void main(String[] args) {
        System.out.println(power(3,2));

    }

    private static int power(int base, int n) {
        if (n != 0) {
            n--;
            z = base * base;
            return power(base, n);
        } else {
            return z;
        }
    }
}