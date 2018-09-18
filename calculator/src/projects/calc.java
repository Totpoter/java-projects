package projects;

import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        System.out.println("Enter first and second number:");
        // Get user input
        Scanner inp= new Scanner(System.in);
        double num1,num2;
        try {
        num1 = inp.nextDouble();
        num2 = inp.nextDouble();
        } catch(Exception e) {
        	System.out.println("Not a number");
        	inp.close();
        	return;
        }
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        // Calculation
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(num1 + num2);
            break;
        case 2:
            System.out.println(num1 - num2);
            break;      
        case 3:
            System.out.println(num1 * num2);
            break;
        case 4:
            System.out.println(num1 / num2);
            break;
            default:
                System.out.println("Select 1,2,3 or 4");


        }

        inp.close();

    }
}