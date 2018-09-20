package scanner_intro;

import java.util.Scanner;
public class scanner_intro {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		/* Namn input */
		System.out.println("Vad heter du?");
		String name=input.nextLine();
		/* Adress input */
		System.out.println("Vad �r din adress?");
		String adress=input.nextLine();
		/* Telefonnummer input */
		System.out.println("Vad �r ditt telefonnummer?");
		String telenmr=input.nextLine();
		/* Klass input */
		System.out.println("Vilken klass g�r du i?");
		String klass=input.nextLine();
		/* Kolla s� att alla f�lt �r ifyllda */
		boolean works=true;
		 if(name.isEmpty()) { 
			 System.out.println("Du m�ste skriva in ditt namn." );
			 works=false;} 
		 if(adress.isEmpty()) {
			 System.out.println("Du m�ste skriva in din adress."); 
			 works=false;}
		 if(telenmr.isEmpty()) {
			 System.out.println("Du m�ste skriva in ditt telefonnummer."); 
			 works=false;}
		 /* Kolla s� att telefonnummer har 10 siffror i sig*/
		boolean numberWorks = true;
		 if(telenmr.length() != 10) {
			 System.out.println("Ditt telefonnummer m�ste ha 10 siffror.");
			 works = false;
		 }
		 /* Kolla s� att telefonnummret endast inneh�ller siffror */
		 for(int i = 0; i < telenmr.length(); i++)
		 {
			 if(!Character.isDigit(telenmr.charAt(i)))
			 {
				 numberWorks = false;
			 }
		 }
		 if(!numberWorks) {
		 System.out.println("Ditt telefonnummer kan endast ha siffror i sig.");
		 works = false;
	 	 }
		 if(klass.isEmpty()) {
			 System.out.println("Du m�ste skriva in din klass."); 
			 works=false;}
		 /* Ifall allt funkar borde detta skrivas ut */
		 if(works == true) { System.out.println("ditt namn �r " + name + ", och du bor p� " + adress + ". Ditt telefonnummer �r " + telenmr + " och du g�r i " + klass);
			input.close(); }
		}
	}