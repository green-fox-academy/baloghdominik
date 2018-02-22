import java.util.*;

public class GuessMyNumber {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        Random rm = new Random();
        int ran= rm.nextInt(999-1) + 1;
        int ran2= rm.nextInt(50-1) + 9;
        int ran3= rm.nextInt(50-1) + 9;


        System.out.println("##################### Help ######################");
        System.out.println("#################################################");
        System.out.println("### Type a number between 1000-2000 for help ###");
        System.out.println("#################################################");
        System.out.println("#################################################");
        System.out.println(" ");
        System.out.println("#########################");
        System.out.println("### Guess the number! ###");
        System.out.println("#########################");

        int t = 0;
        int hint = 1;

        int help;
        int help2;
        int won = 0;
        int round = 1;
        int close = 0;

        int all = 5;
        boolean exit = false;

        int guess;
        while(exit == false) {


            for (int i = 1; i <= all; ) {
                close = 0;

                guess = scanner.nextInt();

                if (guess <= 999) {
                    if (guess == ran) {
                        won++;
                        System.out.println("### Congratulation, you won! ###");
                        int tryings = t + 1;
                        System.out.println("### Number of guesses: " + tryings + " ###");
                        hint = hint - 1;
                        System.out.println("### Number used hints: " + hint + " ###");
                        System.out.println("### Wins: " + won + "/" + round + " ###");
                        t = 0;
                        i = 0;

                        System.out.println("");
                        System.out.println("### Type 10000 to start a new game! ###");
                        System.out.println("### Type 20000 to close the game! ###");
                    } else if (guess > ran) {
                        help = guess - ran;
                        if (help >= 100) {
                            System.out.println("# A tipped tobb mint 100-al magasabb! #");
                            t++;
                            i++;
                        } else if (help <= 100 && help > 10) {
                            System.out.println("# A tipped tobb mint 10-el magasabb! #");
                            t++;
                            i++;
                        } else if (help <= 10) {
                            System.out.println("# Kozel jarsz, de meg nemtalalt! #");
                            t++;
                            i++;
                        }
                    } else if (guess < ran) {
                        help2 = ran - guess;
                        if (help2 >= 100) {
                            System.out.println("# A tipped tobb mint 100-al kissebb! #");
                            t++;
                            i++;
                        } else if (help2 <= 100 && help2 > 10) {
                            System.out.println("# A tipped tobb mint 10-el kiseebb! #");
                            t++;
                            i++;
                        } else if (help2 <= 10) {
                            System.out.println("# Kozel jarsz, de meg nemtalalt! #");
                            t++;
                            i++;
                        }
                    }
                } else if (guess >= 1000 && guess <= 2000) {
                    System.out.println("###");
                    System.out.println("# HELP #");
                    System.out.println("# Hint: type 5000  #");
                    System.out.println("# Restart: type 10000 #");
                    System.out.println("# Quit: type 20000 #");
                    System.out.println("###");
                    // hint, quit
                } else if (guess > 2000 && guess != 5000 && guess != 10000 && guess != 20000) {
                    System.out.println("###########################");
                    System.out.println("# GUESS BETWEEN 1 AND 999 #");
                    System.out.println("# Number of guesses: " + t + "/" + all + " #");
                    System.out.println("###########################");
                    System.out.println("### For Help type 1000 !###");
                    System.out.println("###########################");

                } else if (guess == 10000) {
                    System.out.println("### The game restarted! ###");
                    t = 1;
                    i = 1;
                    round++;
                    hint = 1;
                    ran = rm.nextInt(999 - 1) + 1;

                } else if (guess == 20000) {
                    System.out.println("### We hope you enjoyed this game! ###");
                    System.out.println("### Are you sure, that you want to format C:// ? ###");
                    close = 1;
                    exit = true;

                } else if (guess == 5000 && hint == 0) {
                    int h1, h2;
                    h1 = ran + ran2;
                    h2 = ran - ran3;

                    System.out.println("### HINT ###");
                    System.out.println("# The number is between " + h2 + " and " + h1 + "#");
                    hint++;


                } else if (guess == 5000 && hint == 1) {
                    int ran4 = rm.nextInt(30 - 1) + 9;
                    int ran5 = rm.nextInt(30 - 1) + 9;
                    int h3, h4;
                    h3 = ran + ran4;
                    h4 = ran - ran5;
                    System.out.println("### HINT ###");
                    System.out.println("# The number is between " + h4 + " and " + h3 + "#");
                    hint++;

                } else if (guess == 5000 && hint == 2) {
                    int ran5 = rm.nextInt(10 - 1) + 5;
                    int ran6 = rm.nextInt(10 - 1) + 5;
                    int h5, h6;
                    h5 = ran + ran5;
                    h6 = ran - ran6;
                    System.out.println("### HINT ###");
                    System.out.println("# The number is between " + h6 + " and " + h5 + "#");
                    hint++;

                } else if (guess == 5000 && hint == 3) {
                    int ran7 = rm.nextInt(5 - 1) + 1;
                    int ran8 = rm.nextInt(5 - 1) + 1;
                    int h7, h8;
                    h7 = ran + ran7;
                    h8 = ran - ran8;
                    System.out.println("### HINT ###");
                    System.out.println("# The number is between " + h8 + " and " + h7 + "#");
                    hint++;
                } else if (guess == 5000 && hint > 3) {

                    System.out.println("### HINT ###");
                    System.out.println("### Sorry you don't have more hints! ###");
                }
            }

            if (close != 1) {

                System.out.println("### You Lost! ###");
                System.out.println("### Number of guesses: " + t + " ###");
                int hints = hint - 1;
                System.out.println("### Number used hints: " + hints + " ###");
                System.out.println("### Wins: " + won + "/" + round + " ###");

                System.out.println("");
                System.out.println("### Type 10000 to start a new game! ###");
                System.out.println("### Type 20000 to close the game! ###");

            }
            guess = 10000;
        }

    }
}