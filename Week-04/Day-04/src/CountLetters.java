public class CountLetters {
    public String str;
    public CountLetters(String str){
        this.str = str;
    }

    public int countLetters(){
        int count = 0;
        char currentChar;
        for (int i = 0; i < str.length(); i++){
            currentChar = str.charAt(i);
            count++;
            System.out.println(currentChar+" ");
        }
        return count;
    }
}
