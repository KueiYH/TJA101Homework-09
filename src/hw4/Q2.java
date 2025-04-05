package hw4;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("Q1-2.");
		String s = "Hello World";
		char letters[] = new char[11];
		for (int i = letters.length - 1; i >= 0; i--) {
			 letters[i] = s.charAt(i);
			System.out.print(letters[i]);
		}
		System.out.println();
	}
}
