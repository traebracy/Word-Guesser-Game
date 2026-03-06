import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // defining the scanner, to intake input.

        boolean playAgain = true; // defining a boolean for validation if the user chooses to continue playing.

        while (playAgain) { // use of the boolean.

            String secretWord = "java"; // the secret word that the user must input.

            int attempts = 5; // the amount of attempts the user gets.

            System.out.println("Welcome to the Word Guesser Game!"); // just a simple welcoming message...

            while (attempts > 0) { // when the amount of attempts is greater than 0...

                System.out.println("You have" + " " + attempts + " " + "attempts to guess the secret word."); // gives the user feed as to how many attempts they have & have remaining.

                System.out.print(">> "); // user input.

                String guess = input.nextLine(); // user input picked up as var guess w/ the type being a String (non-primitive).

                if (guess.equals(secretWord)) { // use .equals() instead of == to compare the values, given that the String is a non-primitive.

                    System.out.println("Correct! Input [p] to play again or Input [something] to stop."); // prints out correct if the guess is equal to the secretWord (camel-case java typing convention.) & prompts the user to enter p/P or anything other than this to stop the game.

                    String response = input.nextLine(); // reads the response of the user.

                    if (response.equalsIgnoreCase("p")) { // if the response is P/p it breaks out of the current loop and goes back out to the while (playAgain) loop.
                        break;
                    } else { // if the response is anything other than P/p it stops the program.
                        playAgain = false;
                        break;
                    }

                } else { // if the response does not equal the secret word it post-decrements attempts, so it decrements after the sequence of validation occurs and prints out Incorrect.
                    attempts--;
                    System.out.println("Incorrect!");
                }

            }

            if (attempts > 0) { // when the attempts are not greater than 0 but equal to, this "catches" that
                System.out.println("Out of attempts! Press [p] to play again"); // prompts the user to play again.

                String response = input.nextLine(); // catches the input as "response".

                if (!response.equalsIgnoreCase("p")) { // if the response does not equal p than the game ends.
                    playAgain = false;

                    // value can be thought of as true, !value can be thought of as false, when the response is false in being p the game does not continue.

                }
            }
        }

        input.close();

    }
}

// public; (anyone can access this method.)
// static; (it belongs to the class itself, not an object, so Java can run it without creating an object first.)
// void; (it doesn't return anything.)
// main; (the name the JVM looks for when starting your program.)
// JVM = "Java Virtual Machine."