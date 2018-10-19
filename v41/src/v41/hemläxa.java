package v41;
public class hemläxa {
public static void main(String[] args) {
	double x = volume(5);
	System.out.println(x);
}

public static double volume(double radius) {
	double res = radius * 4 * 3.14 * radius * radius * radius / 3;
	return res;
}
}