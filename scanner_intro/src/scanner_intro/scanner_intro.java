package scanner_intro;

import java.util.Scanner;
public class scanner_intro {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Vad heter du?");
		
		String name=input.nextLine();
		System.out.print("ditt namn är " + name);
		input.close();
	}
	
}