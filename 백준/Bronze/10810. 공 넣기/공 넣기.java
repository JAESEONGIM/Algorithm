

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		int n = (sc.nextInt());
		int m = (sc.nextInt());
		int[] arr=new int[n];
		for(int a = 0; a < m; a++) {
			int i =(sc.nextInt());
			int j =(sc.nextInt());
			int k =(sc.nextInt());
			
			for(int y=i; y<=j; y++) {
				arr[y-1]=k;
			}
		}
		for(int a = 0; a<n; a++) {
			System.out.print(arr[a]+" ");
		}
	
	}
}
