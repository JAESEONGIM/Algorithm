

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int a = 0; a < i; a++) {
				System.out.print(" ");
			}
			
			
			for(int k = (2*n-1)-i*2; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
		}for(int i = 1; i < n; i++) {
			for(int a = n-2; a >= i; a--) {
				System.out.print(" ");
			}for(int b = 0; b < i*2+1; b++) {
				System.out.print("*");}
//			}for(int c = n-2; c >= i; c--) {
//				System.out.print(" ");
//			}
			
			
			System.out.println();
		
		
		}
	}
}
