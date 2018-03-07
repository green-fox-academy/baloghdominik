package CharSequence;

public class Gnirts implements CharSequence{
    public String text;

    public Gnirts(String s) {
        this.text = s;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
