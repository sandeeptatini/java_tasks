package demo;

public class Reverse {
	int rev;
	public int reverse(int num) {
		while(num >0) {
			int digits = num % 10;
			 rev = rev*10+digits;
			 num = num /10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		System.out.println(obj.reverse(123456));
	}

}
