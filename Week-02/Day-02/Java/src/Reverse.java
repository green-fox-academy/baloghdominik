import java.util.ArrayList;

public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        System.out.println(reverse(reversed));
    }

    private static String reverse(String word) {
        ArrayList<Character> aList = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++) {
            aList.add(word.charAt(i));
        }
        String word2 = "";
        for (int k = word.length() -1; k >= 0; k--) {

            word2 += String.valueOf(aList.get(k));
        }
        return word2;
    }



    /*public static String reverse(String s) {
        char c[] = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return new String(c);
    }*/
}
