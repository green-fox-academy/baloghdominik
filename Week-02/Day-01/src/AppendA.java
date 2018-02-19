public class AppendA {

    public static void main(String[] args) {
        String[] nimals = {"Kuty", "macsk", "cic"};
        appendA(nimals);
    }

    public static void appendA(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] +"a");
        }
    }

}