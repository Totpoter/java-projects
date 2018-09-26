import java.util.Scanner;
public class loops {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		boolean running = true;
		System.out.println("Uppgifter:\n1 = heltal under 100 \n2 = heltal frpn 25-50 \n3 = heltal under 20 omvänt \n4 = heltal under 10 gångertabell \n5 = tal från konsol med 0 för att addera \n6 = text från konsolen med exit för att gå ut \n7 = loopar som skapar mönstret x xx xxx xxxx \n8 = jämna tal mellan 100-1000 \n9 = heltal i fakultet");
		while(running) {
			System.out.println("Välj uppgift 1-9, skriv 0 för att gå ur programmet");
			int unmr = input.nextInt();
			if(unmr == 0) {
				System.exit(0);
			}
			/* Summan av alla heltal under 100 */
			if(unmr == 1) {
				int sum=0;
				for(int i = 0; i <= 100; i++) {
					sum+=i;
				}
				System.out.println(sum);
			}
			/* Skapa ett program som skriver ut skriver ut alla heltal från 25-50. */
			if(unmr == 2) {
			for(int i=25; i<=50; i++) {
				System.out.println(i);
			}
			}
			/*Skapa ett program som skriver ut alla heltal under 20 i omvänd ordning. */
			if(unmr == 3) {
			for(int i=20; i>0; i--) {
				System.out.println(i);
			}
			}
			/* Skapa ett program som läser in ett heltal under 10 och skriver ut alla tal i siffrans gångertabell. */
			if(unmr == 4) {
			System.out.println("Skriv ett tal mellan 1-10");
			int under_tio=input.nextInt();
			for(int i=0; i<=10;i++) {
				System.out.println(under_tio * i);
			}
			}
			/* Skapa ett program som läser in tal från konsolen och när man skriver in talet 0 ska den skriva ut summan av alla tal. */
			if(unmr == 5) {
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
			}
			/* Skapa ett program som läser in text från konsolen och avslutas när texten exit skrivs in. */
			if(unmr == 6) {
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
			}
			if(unmr == 7) {
			/* Skapa ett program som med hjälp av loopar skriver ut följande mönster: x xx xxx xxxx */
	//		System.out.println("Skriv ett nummer mellan 1-9");
	//		int n = input.nextInt(); 
	//		for(int i = 0; i <= n; i++) {
	//			for(int j = 0; j < i; j++) {
	//				System.out.print(n);
	//			}
	//			System.out.println();
	//		}
			for(int i = 0; i <= 4; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("x");
				}
				System.out.println();
			}
			}
			if(unmr == 8) {
			/* Skapa ett program som skriver ut alla jämna tal mellan 100-1000 */
			for(int num = 100; num <=1000; num+=2 ) {
				System.out.println(num + "\n");
			}
			}
			if(unmr == 9) {
			/* Skapa ett program som läser in ett heltal och skriver ut talet i fakultet. */
			System.out.println("Skriv ett heltal");
			int heltal = input.nextInt();
			int resultat = 1;
			for(int i = 1; i <= heltal; i++  ) {
				resultat *= i;
			}
			System.out.println(resultat);
			}
			/* fibonacci */
			if(unmr == 10) {
			int x = 0;
			int y = 1;
			for(int i = 0; i < 10; i++) {
				System.out.print(x + " ");
				int z = x+y;
				x = y;
				y = z;
			}
			System.out.println();
			}
		}
	}
}