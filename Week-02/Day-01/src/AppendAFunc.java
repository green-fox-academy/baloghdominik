public class AppendAFunc {

    public static void main(String[] args) {
        String am = "Kuty";
        System.out.println(appendA(am));
    }

    public static String appendA(String a) {
        a = (a+ "a");
        return a;
    }

}