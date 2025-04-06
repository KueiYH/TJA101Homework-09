package hw4;

public class Q3 {
	public static void main(String[] args) {
		String planets[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowelsNumbers = 0;
		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				if (planets[i].charAt(j) == 'a' || planets[i].charAt(j) == 'e' || planets[i].charAt(j) == 'i'
						|| planets[i].charAt(j) == 'o' || planets[i].charAt(j) == 'u') {
					vowelsNumbers += 1;
				}
			}
		}
		System.out.println(vowelsNumbers);
	}
}
