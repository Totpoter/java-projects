import java.util.Scanner;
public class loops {
	/* Summan av alla heltal under 100 */
	public static void main(String[] args) {
		int sum=0;
		for(int i = 0; i <= 100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		/* Skapa ett program som skriver ut skriver ut alla heltal från 25-50. */
		for(int i=25; i<=50; i++) {
			System.out.println(i);
		}
		/*Skapa ett program som skriver ut alla heltal under 20 i omvänd ordning. */
		for(int i=20; i>0; i--) {
			System.out.println(i);
		}
		/* Skapa ett program som läser in ett heltal under 10 och skriver ut alla tal i siffrans gångertabell. */
		Scanner input= new Scanner(System.in);
		System.out.println("Skriv ett tal mellan 1-10");
		int under_tio=input.nextInt();
		for(int i=0; i<=10;i++) {
			System.out.println(under_tio * i);
		}
		/* Skapa ett program som läser in tal från konsolen och när man skriver in talet 0 ska den skriva ut summan av alla tal. */
		boolean keepLooping = true;
		System.out.println("Skriv tal, skriv in 0 när du vill addera ihop dem");
		int tal1 = 0;
		int result = 0;
		while(keepLooping) {
			tal1 = input.nextInt();
			if(tal1 == 0) {
				keepLooping = false;
				System.out.println(result);
			}
			
			result += tal1;
		}
		/* Skapa ett program som läser in text från konsolen och avslutas när texten exit skrivs in. */
		boolean notExit = true;
		System.out.println("Skriv text, skriv exit när du är klar");
		while(notExit) {
			String text = input.nextLine();
			if(text.equals("exit")) {
				notExit = false;
				continue;
			}
			System.out.println(text);
		}
		/* Skapa ett program som med hjälp av loopar skriver ut följande mönster: x xx xxx xxxx */
		/*for() {
			
		} */
		/* Skapa ett program som skriver ut alla jämna tal mellan 100-1000 */
		for(int num = 100; num <=1000; num+=2 ) {
			System.out.print(num + "\n");
		}
		/* Skapa ett program som läser in ett heltal och skriver ut talet i fakultet. */
	}
}