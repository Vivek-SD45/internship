import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int Right;
    static int attempts = 0;
    static int maxattempts = 8;

    public GuessTheNumber() {
        Random rand = new Random();
        Right = rand.nextInt(100);
        System.out.println("choose  the number from 1 to 100");
        System.out.println("i tell you whether ur choosing number is right or wrong guess");
    }

    public int rightNumber() {
        return Right;
    }

    public static int userInput() {

        int user;
        System.out.println("Enter your number which you choose");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectguess(int i, int j) {

        if (attempts < maxattempts) {
            if (i == j) {

                System.out.println("Correct number guesses");
                System.out.println("Your score is "+attempts+"out of"+maxattempts);
            } else if (i > j) {

                System.out.println("Guess number is larger -----choose another");
            } else {
                System.out.println("Guess number is smaller then the chooosen Number ----choose another number");

            }
            attempts++;
        } else {
            System.out.println("your attempts are over you are fail to guess");
            

        }
    }

    public static void main(String args[]) {

        int user = 0, comp, itration = 0;
        GuessTheNumber g = new GuessTheNumber();
        do {

            user = userInput();
            comp = g.rightNumber();
            isCorrectguess(user, comp);
            itration++;

        } while (user != comp);
        System.out.println("You guess Number in" + itration + "attemps");

    }
}