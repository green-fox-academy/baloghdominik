package zoo;

public class Mammal extends Animal{

    public Mammal(String name, int age, int legs, String color, String gender){
        super(name,age,legs,color,gender);
    }

    @Override
    public String breed() {
        return "creating little ones.";
    }
}
