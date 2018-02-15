public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int chs = 14 * 60;
        int cms = chs + 34;
        int css = (cms * 60 + 42);

        int sid = 24 * 60 * 60;

        System.out.println(sid - css);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}