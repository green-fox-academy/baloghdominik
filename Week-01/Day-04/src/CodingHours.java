public class CodingHours {
    public static void main(String[] args) {
        int hours = 6;
        double weeks = 17;
        int workdays = 5;

        System.out.println("atlag kodolasi ido: " + (int) (weeks*workdays*hours));

        double percentage = ((weeks*52)/(weeks*168)*100);

        System.out.println("Az orak " + (int) percentage + "%-at kodolassal toltjuk!");

    }
}