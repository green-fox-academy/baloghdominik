package zoo;

public class Reptile extends Animal{

    public Reptile(String name, int age, int legs, String color, String gender){
        super(name,age,legs,color,gender);
    }

    @Override
    public String breed() {
        return "creating eggs.";
    }
}