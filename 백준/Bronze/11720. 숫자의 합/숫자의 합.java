

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int a = 0;
		n = sc.nextInt();
		String s = sc.next();
		for(int i = 0; i < n; i++) {
			a = Character.getNumericValue(s.charAt(i));
			sum = sum + a;
		}
		System.out.println(sum);
		
	}
}
