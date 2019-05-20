import hangman.HangmanConsoleWindow;
public class hangman {
	// Permanenta variabler som inte �ndrar form
	private static String[] words = { "blep", "fwomp", "heroin", "klorin", "fredrik", "patrik" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String guessWord = new String(new char[word.length()]).replace("\0", "_");
	// Variabel som h�ller koll p� hur m�nga gissningar som har gjorts
	private static int count = 0;
	private static HangmanConsoleWindow window;
	public static void main(String[] args) {
		// Skapa f�nstret
		window = new HangmanConsoleWindow();

		while (count <= 7 && guessWord.contains("_")) {
			window.clear();
			display();
			window.println("Gissa p� en bokstav i ordet");
			for (int i = 0; i < guessWord.length(); i++) {
				window.print(guessWord.charAt(i) + " ");
			}
			window.println();


			String guess = window.nextString();
			
			hang(guess);

		}
		window.exit();
	}
	// Skapa ordet och funktionen f�r att gissa bokst�ver
	public static void hang(String guess) {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newWord += guess.charAt(0);
			} else if (guessWord.charAt(i) != '_') {
				newWord += word.charAt(i);
			} else {
				newWord += "_";
			}
		}
		// �ka count variabeln f�r varje g�ng anv�ndaren gissar
		if (guessWord.equals(newWord)) {
			count++;
		} else {
			guessWord = newWord;
		}
		// Ifall ordet �r r�tt s� skall programmet visa ordet och st�ngas av efter n�gra sekunder
		if (guessWord.equals(word)) {
			window.println("R�tt! Ordet var: " + word);
			window.println("Programmet st�ngs om 3 sekunder");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
	}
	// Sj�lva displayen som visas n�r man gissar fel
	public static void display() {
		// Switch ist�llet f�r massa if satser f�r att g�ra det s� minimalt som m�jligt
		switch (count) {
		case 1:
			window.println("Fel gissning, f�rs�k igen");
			window.println();
			window.println();
			window.println();
			window.println();
			window.println("___|___");
			window.println();
			break;

		case 2:
			window.println("Fel gissning, f�rs�k igen");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("___|___");
			break;

		case 3:
			window.println("Fel gissning, f�rs�k igen");
			window.println("   ____________");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("   | ");
			window.println("___|___");
			break;

		case 4:
			window.println("Fel gissning, f�rs�k igen");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |");
			window.println("   |");
			window.println("   |");
			window.println("___|___");
			break;

		case 5:
			window.println("Fel gissning, f�rs�k igen");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |           |");
			window.println("   |           |");
			window.println("   |");
			window.println("___|___");
			break;

		case 6:
			window.println("Fel gissning, f�rs�k igen");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |           |");
			window.println("   |           |");
			window.println("   |          / \\ ");
			window.println("___|___      /   \\");
			break;
// N�r anv�ndaren har slut p� gissningar st�ngs programmet av med orden "GAME OVER!"
		case 7:
			window.println("GAME OVER!");
			window.println("   ____________");
			window.println("   |          _|_");
			window.println("   |         /   \\");
			window.println("   |        |     |");
			window.println("   |         \\_ _/");
			window.println("   |          _|_");
			window.println("   |         / | \\");
			window.println("   |          / \\ ");
			window.println("___|___      /   \\");
			window.println("GAME OVER! Ordet var: " + word);
			break;
		}	
	}
}