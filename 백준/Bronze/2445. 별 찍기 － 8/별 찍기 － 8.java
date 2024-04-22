

import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print("*");
				
				}
			for(int j = (2*a)-(i*2); j>0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
				
				System.out.println();
				
			
		}
		for(int i = a-1; i >0 ; i--) {
			for(int k = 0; k < i; k++) {
				System.out.print("*");
				
				}
			for(int j = 0; j < (2*a)-(i*2); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
				
				}
			System.out.println();
		
		
		}
	}
}
	


