package zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable{

    public Bird(String name, int age, int legs, String color, String gender){
        super(name,age,legs,color,gender);
    }

    @Override
    public String breed() {
        return "creating eggs.";
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }
}