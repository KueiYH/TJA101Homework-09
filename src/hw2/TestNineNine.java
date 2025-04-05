package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print( i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
//////// for...while
		for (int i = 1; i <10; i++) {
			int j = 1;
			while(j < 10) {
				System.out.print( i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
//////// for do...while
		for (int i = 1; i < 10; i++) {
			int j = 1;
			do {
				System.out.print( i + "*" + j + "=" + i * j + "\t");
				j ++;
				} while (j < 10); 

					System.out.println();
			}
//////// while do...while
		int i = 1;
		while (i < 10) {
			int j = 1;
			do { 
				System.out.print( i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j < 10);
			i ++;
			System.out.println();
		}
	}
}
