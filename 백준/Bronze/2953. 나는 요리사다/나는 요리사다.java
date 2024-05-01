

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		int arr2[] = new int[5];
		
		int max = 0;
		int top = 0;
		for(int i = 0; i < 5; i++) {
			int sum = 0;
			for(int k = 0; k < arr.length; k++) {
				
				arr[k]=sc.nextInt();
				sum = sum + arr[k];
				
			}if(sum > max) {
				max = sum;
				top = i+1;
			}
		}System.out.print(top + " " + max);
	}
}
