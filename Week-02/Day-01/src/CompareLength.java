public class CompareLength {
    public static void main(String[] args) {
            int[] p1 = {1,2,3};
            int[] p2 = {4,5};
            int p1length = p1.length;
            int p2length = p2.length;

            if (p2length > p1length) {
                System.out.println("p2 has more elements than p1.");
            } else {
                System.out.println("p2 has less elements than p1.");
            }
        }
}
