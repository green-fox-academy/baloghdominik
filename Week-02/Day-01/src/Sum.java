public class Sum {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(sum(num1));
    }

    public static int sum(int num) {
        int result = 0;

        for (int i = 0; i <= num; i++) {
           result = result + i;
        }
        return result;
    }

}