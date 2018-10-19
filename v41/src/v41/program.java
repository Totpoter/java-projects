package v41;
import java.util.Scanner;
public class program {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		lol();
		System.out.println(min(4, 2));
		kelvin(3);
		ageControl(input.nextInt());
		stair(3);
	}
	
	public static void lol() {
		System.out.println("HAHAHAHAHA");
	}
	
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}
	public static void count(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
				
	}
	public static double kelvin(double celsius) {
		celsius += 273;
		return celsius;
	}
	public static void ageControl(int age) {
		if(age <= 5) {
			System.out.println("Småbarn får inte göra något");
		}
		if(age <= 12 && age > 5) {
			System.out.println("Du får spela Fortnite.");
		}
		if(age <= 14 && age > 13) {
			System.out.println("Du är tonåring.");
		}
		if(age <= 17 && age >14) {
			System.out.println("Du får köra moppe.");
		}
		if(age <= 19 && age >17) {
			System.out.println("Du får köra bil.");
		}
		if(age <= 64 && age > 17) {
			System.out.println("Du får gå på systemet");
		}
		if(age <= 99 && age > 64) {
			System.out.println("Du är pensionär.");
		}
		if(age > 100) {
			System.out.println("R.I.P");
		}
	}
	public static void stair(int steps) {
		for(int i = 0; i <= steps; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
