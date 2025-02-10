import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;
        int attempts = 10;

        boolean trying = true;
        Scanner input = new Scanner(System.in); // Move Scanner declaration outside loop

        while (trying) {
            if (attempts == 0) {
                System.out.println("All attempts are finished.");
                break;
            }

            System.out.println("Enter Your Guess:");
            int guess = input.nextInt();

            if (guess < random) {
                attempts--;
                System.out.println("Value is Low. Remaining attempts are " + attempts);
            } else if (guess > random) {
                attempts--;
                System.out.println("Value is High. Remaining attempts are " + attempts);
            } else {
                System.out.println("Congrats! You're correct.");
                trying = false;
            }
        }

        System.out.println("Game finished..");
        input.close(); // Close Scanner after the game ends
    }
}
