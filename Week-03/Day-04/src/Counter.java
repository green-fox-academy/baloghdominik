public class Counter {
    public static void main(String[] args) {
        counter(10);
    }

    private static void counter(int n) {
        if (n == 0){
            System.out.println(0);
        } else {
            System.out.println(n);
            n--;
            counter(n);
        }
    }
}
