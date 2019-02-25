package w2;
import java.io.*;
import java.util.Scanner;

public class main {

	//Skapa variabler för att hålla koll på svårighetsgraden och spelet i sig
    public static final int DIFFICULTY_EASY = 1;
    public static final int DIFFICULTY_NORMAL = 2;
    public static final int DIFFICULTY_HARD = 3;
    public static final int DIFFICULTY_SUPER_HARD = 4;

    public static int currentDifficulty = 0;
    public static int gameWon = 0;
    public static int totalGuesses = 0;
    public static int currentGameGuesses = 0;

    //Skapa en metod för att sätta ett nummer i relevans till svårighetsgraden
    private static int getDifficultyHigh(int difficulty) {
        int result = 100;

        switch(difficulty) {
            case DIFFICULTY_EASY: {
                result = 25;
            } break;

            case DIFFICULTY_NORMAL:{
                result = 100;
            } break;

            case DIFFICULTY_HARD: {
                result = 250;
            } break;

            case DIFFICULTY_SUPER_HARD: {
                result = 500;
            } break;
        }

        return result;
    }
    private static int Random(int difficulty) {
        int high = DifficultyHigh(difficulty);
        int result = (int) (Math.random() * high);

        return result;
    }
    //Skapa metoden som ändrar svårighetsgraden ifall spelaren vill spela igen
    private static int CorrectGuess(Scanner scanner, boolean newDifficulty) {
        if(newDifficulty) {
            System.out.println("Difficulty: ");
            System.out.printf("\tEasy: %d\n", DIFFICULTY_EASY);
            System.out.printf("\tNormal: %d\n", DIFFICULTY_NORMAL);
            System.out.printf("\tHard: %d\n", DIFFICULTY_HARD);
            System.out.printf("\tSuper Hard: %d\n", DIFFICULTY_SUPER_HARD);

            currentDifficulty = scanner.nextInt();
        }

        int correctGuess = getRandomValue(currentDifficulty);

        return correctGuess;
    }
}