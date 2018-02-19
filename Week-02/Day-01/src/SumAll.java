public class SumAll {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};

        int result = 0;

        for (int i = 0; i < ai.length; i++){
            result = result + ai[i];
        }

        System.out.println(result);
    }
}
