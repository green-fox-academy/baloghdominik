public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10

        a += 10;
        System.out.println(a);




        int b = 100;
        b -= 7;
        // make it smaller by 7


        System.out.println(b);




        int c = 44;
        c *= 2;
        // please double c's value


        System.out.println(c);




        int d = 125;
        d /= 5;
        // please divide by 5 d's value


        System.out.println(d);




        int e = 8;
        e *= e;
        // please cube of e's value


        System.out.println(e);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean bigger = f2 > f1;
        System.out.println(bigger);





        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean dbl = ((g2 *= 2) > g1);
        System.out.println(dbl);




        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int hh;
        hh = h % 11;
        boolean divi = hh == 0;
        System.out.println(divi);





        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i3 = i2 * i2;
        int i4 = i2 * i2 * i2;
        boolean i5 = (i1 > i3 && i1 < i4);
        System.out.println(i5);




        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        int jj,jjj;
        jj = j % 3;
        jjj = j % 5;
        boolean jjjj = (jj == 0 && jjj == 0);
        System.out.println(jjjj);




        String k = "Apple";
        //fill the k variable with its cotnent 4 times


        for(int k1 = 0; k1 < 2; k1++) {
            k = k + k;
        }
        System.out.println(k);
    }
}