package demo;

public class Factorial {
	
	public int fact1(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		else {
			return num*(fact1(num-1));
		}
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println("Factorial of a Number: "+obj.fact1(5));
	}

}
