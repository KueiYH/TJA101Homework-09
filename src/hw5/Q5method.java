package hw5;

public class Q5method {
	
	public static String genAuthCode() {
		String randomNum = "";
		String x [] = {"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for(int i = 0; i < 6; i ++) {
			int a = (int)(Math.random() * x.length);
			randomNum += x[a];
		}
		return randomNum;
	}
}
