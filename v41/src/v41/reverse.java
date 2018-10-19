package v41;
import java.util.Scanner;
 
public class reverse {
    public static void main(String[] args)
    {
        System.out.println("Skriv ord som skall vändas baklänges:");
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String reverse = reverse(str);
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        input.close();
    }
    public static String reverse(String str) {
    	String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}