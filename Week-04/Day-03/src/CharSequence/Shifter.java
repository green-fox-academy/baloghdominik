package CharSequence;

public class Shifter implements CharSequence{
    public String s;
    public int i;
    public Shifter(String s, int i){
        this.s = s;
        this.i = i;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return s.charAt(index+i);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
