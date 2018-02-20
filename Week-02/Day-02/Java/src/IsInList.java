import java.util.*;

public class IsInList{
    public static void main(String... args){
        //ArrayList<Integer> list = (ArrayList)Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }

    private static Boolean checkNums(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        Boolean b;
        if (list.containsAll(list2)){
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}