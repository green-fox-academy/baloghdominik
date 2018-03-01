public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(bunny(100));

    }

    public static int bunny (int n) {
        if (n % 2 == 0) {
            if (n == 0) {
                return 0;
            } else {
                n--;
                return 3 + bunny(n);
            }
        } else {
            if (n == 0) {
                return 0;
            } else {
                n--;
                return 2 + bunny(n);
            }
        }
    }
}
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).