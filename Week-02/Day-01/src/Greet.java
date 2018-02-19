public class Greet {

    public static void main(String[] args) {
        String al = "GreenFox";
        System.out.println(greeting(al));
    }

    public static String greeting(String greet) {
        greet = ("Welcome "+ greet +"!");
        return greet;
    }

}