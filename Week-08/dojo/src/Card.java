public class Card {

    private String color;
    private String value;

    Card(String value, String color){
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    public String getCard() {
        return value + color;
    }
}
