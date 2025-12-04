package demo;

public class Vowels {
	char c;
	public static void main(String[] args) {
		String s = "sandeep";
		String rev = " ";
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'|| c == 'A'|| c == 'E' || c == 'I' || c == 'O'|| c == 'U') {
				rev = c+rev;
			}
		}
		System.out.println(rev);
	}

}
