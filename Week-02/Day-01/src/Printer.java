public class Printer {
    public static void main(String[] args) {

        String[] word = {"alma","korte","dinnye"};
        printer(word);
    }

    public static void printer(String... Words) {

            for (String result : Words) {
                System.out.println(result);
            }
        }
    }

