import zoo.*;

public class Zoo {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 1,4, "green","bull");
        Mammal mammal = new Mammal("Koala", 1,4, "green","buck");
        Bird bird = new Bird("Parrot", 1,4, "green","male");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}
