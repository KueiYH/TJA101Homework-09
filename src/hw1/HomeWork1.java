package hw1;

public class HomeWork1 {
	public static void main(String[] args) {
		
		//Q1
		System.out.print("Q1. ");
		int a = 6;
		int b = 12;
		System.out.println("和:" + (a + b) + "," + "積:" + (a * b));
		//Q2
		System.out.print("Q2. ");
		int egg = 200;
		System.out.println("200顆蛋是" + egg / 12 + "打" + 200 % 12 + "顆" );
		//Q3
		System.out.print("Q3. ");
		int totalSecs = 256559;
		int days = totalSecs / 86400;
		int hours = (totalSecs % 86400) / 3600;
		int mins = ((totalSecs % 86400) % 3600) / 60;
		int secs = ((totalSecs % 86400) % 3600) % 60;
		System.out.println("共" + days + "天" + hours + "小時" + mins + "分" + secs + "秒");
		//Q4
		System.out.print("Q4. ");
		float pi = 3.1415f;
		float radius = 5;
		float area = radius * radius * pi;
		float perimeter = 2 * radius * pi;
		System.out.println("面積:" + area + " 周長:" + perimeter);
		//Q5
//		本利和= 本金× (1 + 年利率) ^ 期間
		System.out.print("Q5. ");
		double principal = 1500000;
		double interest = 0.02;
		for (int i = 0; i <= 10; i ++) {
			principal = principal * (1 + interest);
		}
		double sum = principal;
		
		System.out.println("十年過後總金額為:"+ sum + "元" );
		
		//Q6
		System.out.print("Q6. ");
		System.out.println(5 + 5 + "，兩個5都沒有單引或雙引號，Java視作數字相加");
		System.out.println(5 + '5' + "，因為字元符5的unicode碼為0035，十六進制0035轉為十進制為53，整數53 + 5等於58");
		System.out.println(5 + "5" + "，因為整數與string相加會變成文字串接");
	}
}