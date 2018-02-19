public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"First", "Second", "Third"};
        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;
    }
}

