package demo;

public class Duplicates {
	public static void main(String[] args) {
		String str = "Madam";
		String res = str.toLowerCase();;
		for(int i = 0; i<res.length();i++) {
			char c = res.charAt(i);
			if(res.indexOf(c) == i) {
			   if(res.indexOf(c , i + 1) != -1) {
				   System.out.print(c);
			   }
			}
		}
	}
}

