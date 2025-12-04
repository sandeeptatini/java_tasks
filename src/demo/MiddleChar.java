package demo;
public class MiddleChar {
    public static void main(String[] args) {
        String word = "12345677"; 
        int len = word.length();
        int mid = len / 2;
        if (len % 2 == 0) {  
            char c = word.charAt(mid - 1);
            char d = word.charAt(mid);
            System.out.println("Middle characters: " + c + "" + d);
        } else {
            System.out.println("Middle character: " + word.charAt(mid));
        }
    }
}
