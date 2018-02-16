public class PrintEven {
    public static void main(String[] args) {

        for (int i = 0; i <= 500;) {

            int k = i % 2;
            boolean even = k == 0;

            if (even == true) {
                System.out.println(i);
            }

            i++;
        }

    }
}
