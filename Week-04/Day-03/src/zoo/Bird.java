package zoo;

public class Bird extends Animal{

    public Bird(String name, int age, int legs, String color, String gender){
        super(name,age,legs,color,gender);
    }

    @Override
    public String breed() {
        return "creating eggs.";
    }
}