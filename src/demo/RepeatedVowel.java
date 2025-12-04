package demo;

public class RepeatedVowel {
    public static void main(String[] args) {
        String s = "aeiouAEIOUaeiouAEIOU";
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if (str.indexOf(c) == i) {
                    if (str.indexOf(c, i + 1) != -1) {
                        System.out.print(c);
                    }
                }
            }
        }
    }
}
									