package zoo;

public abstract class Animal {
    public String name;
    public int age;
    public int legs;
    public String color;
    public String gender;

    public Animal(String name, int age, int legs, String color, String gender){
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.color = color;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public abstract String breed();
}
