public class Matrix {
    public static void main(String[] args) {
        int[][] multiArray = new int[4][4];
        show(multiArray);
    }

    public static void show(int[][] multi) {
        for (int row = 0; row < multi.length; row++) {
            for (int column = 0; column < multi[row].length; column++) {
                if (row == column){
                    multi[row][column] = 1;
                }
                System.out.print(multi[row][column] + " ");
            }
            System.out.println();
        }
    }
}