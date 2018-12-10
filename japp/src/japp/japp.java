package japp;

public class japp{
	public static void main(String[] args) {
		Sjorovarsprak.sjorovare("hej hej");
	}
	public static double volume(double radius) {
		double res = radius * 4 * 3.14 * radius * radius * radius / 3;
		return res;
	}
}