package test;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println(display(i));
		}
	}
	
	private static String display (int n) {
		String str = "";
		if (n % 3 == 0) str += "Fizz";
		if (n % 5 == 0) str += "Buzz";
		return str.equals("") ? String.valueOf(n) : str;
	}
}
