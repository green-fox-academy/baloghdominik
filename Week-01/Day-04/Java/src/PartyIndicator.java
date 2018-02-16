import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        //This task is not finished yet!
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        System.out.println("How many girls are going to the party?");
        int girls = scanner.nextInt();
        System.out.println("How many boys are going to the party?");
        int boys = scanner.nextInt();

        int ppl = girls + boys;

        String type = "";

        if (ppl > 20) {
            type = "quite cool";
        } else if (ppl == 0){
            type = "bullshit";
        } else {
            type = "avrage";
        }

        String type2 = "";

        if (girls == boys && ppl > 0) {
            type2 = "or excellent";
        } else if (girls > boys && boys > 0) {
            type2 = "or the best of all time";
        } else if (girls > boys && boys == 00) {
            type2 = "or a girl party";
        } else if (boys > girls && ppl > 0 || girls == 0 && ppl > 0) {
            type2 = "sausage party";
        } else if (ppl == 0) {
            type2 = "";
        }

        System.out.println("This party is going to be "+ type +" "+ type2 +"!");
    }
}

// I put some extra effort into this task :D



// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
