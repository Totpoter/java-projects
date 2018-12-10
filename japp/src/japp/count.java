package japp;
public class count {
	public static void main(String[] args) {
		System.out.println(count("ord med c",'c'));
	}
public static int count(String str, char c) {
	int count = 0;
	for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == c) {
			count++;
		}
	}
	
    return count;
}
}