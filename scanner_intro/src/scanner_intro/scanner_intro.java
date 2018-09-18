/* TODO Fixa så att man bara kan skriva nummer i telenmr*/
package scanner_intro;

import java.util.Scanner;
public class scanner_intro {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		/* Namn input */
		System.out.println("Vad heter du?");
		String name=input.nextLine();
		/* Adress input */
		System.out.println("Vad är din adress?");
		String adress=input.nextLine();
		/* Telefonnummer input */
		System.out.println("Vad är ditt telefonnummer?");
		int telenmr=input.nextInt();
		input.nextLine();
		/* Klass input */
		System.out.println("Vilken klass går du i?");
		String klass=input.nextLine();
		/* Printa ut allt och stänga scannern */
		boolean works=true;
		 if(name.isEmpty()) { 
			 System.out.println("Du måste skriva in ditt namn." );
			 works=false;} 
		 if(adress.isEmpty()) {
			 System.out.println("Du måste skriva in din adress."); 
			 works=false;}
		 if(telenmr == 0) {
			 System.out.println("Du måste skriva in ditt telefonnummer."); 
			 works=false;}
		 if(klass.isEmpty()) {
			 System.out.println("Du måste skriva in din klass."); 
			 works=false;}
		 if(works == true) { System.out.println("ditt namn är " + name + ", och du bor på " + adress + ". Ditt telefonnummer är " + telenmr + " och du går i " + klass);
			input.close(); }
		}
	}
	