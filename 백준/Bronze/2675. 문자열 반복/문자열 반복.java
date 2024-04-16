

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int t=0;
		int r = 0 ;
		char c;
		t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			r= sc.nextInt();
			s=sc.next();
				
					for(int j=0; j < s.length();j++) {
						for(int k=0; k < r; k++) {
						c = s.charAt(j); 
						System.out.print(c);
					}
					
					}System.out.println();
					
				}
		
		
		
	}

}

