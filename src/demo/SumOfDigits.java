package demo;

public class SumOfDigits {
	int sum;
	public int Numbers(int num) {
		while(num > 0) {
			int digits = num %10;
		     sum = sum+digits;
			num = num /10;
		}
		return sum;
	}
	public static void main(String[] args) {
	SumOfDigits num = new SumOfDigits();
	System.out.println(num.Numbers(123456));
	
	}

}
