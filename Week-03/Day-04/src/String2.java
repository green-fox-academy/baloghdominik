public class String2 {
    public static void main(String[] args) {
        String string = "Xerxes";
        char from = 'x';
        char to = 0;

        System.out.println(remove(string, from, to));
    }

    public static String remove(String string, char from, char to){
        if (string.length() < 1) {
            return string;
        }
        else {
            char first = from == string.charAt(0) ? to : string.charAt(0);
            return first + remove(string.substring(1), from, to);
        }
    }
}