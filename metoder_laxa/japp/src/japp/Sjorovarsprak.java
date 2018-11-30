package japp;
public class Sjorovarsprak {
	public static void main(String[] args) {
		System.out.println(sjorovare("mening på sjörövarspråket"));
			
	}
	public static String sjorovare(String str) {
		char match[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'z', 'x'};
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			boolean found = false;
			for(int j = 0; j < match.length; j++) {
				if(str.charAt(i) == match[j]) {
					found = true;
					break;
				}
			}
			if(found) {
				res += str.charAt(i) + "o" + str.charAt(i);
			} else {
				res += str.charAt(i);
			}
		}
		return res;
	}
}