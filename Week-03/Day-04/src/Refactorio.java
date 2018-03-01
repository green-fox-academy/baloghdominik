public class Refactorio {
    public static void main(String[] args) {
        System.out.println(factorio(5));

    }
    public static int factorio(int n) {
        int factorial = 1;
        for (int i = 1; i  < n + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
