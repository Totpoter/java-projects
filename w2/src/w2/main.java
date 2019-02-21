package w2;
import java.io.*;
import java.util.Scanner;

public class main {

    public static final int DIFFICULTY_EASY = 1;
    public static final int DIFFICULTY_NORMAL = 2;
    public static final int DIFFICULTY_HARD = 3;
    public static final int DIFFICULTY_SUPER_HARD = 4;

    public static int currentDifficulty = 0;
    public static int gameWon = 0;
    public static int totalGuesses = 0;
    public static int currentGameGuesses = 0;

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
}