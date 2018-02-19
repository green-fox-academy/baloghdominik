public class Factorio {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorio(num));
    }

    public static int factorio(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }

}