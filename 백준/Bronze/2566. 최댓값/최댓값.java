
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int n = 0;
		int m = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				arr1[i][k]=sc.nextInt();
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int k = 0; k < 9; k++) {
				if(max <=arr1[i][k]) {
					max = arr1[i][k];
					 n = i+1;
					 m = k+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(n +" "+ m);
		
		
		
	}	
		
		
		
		
		
	}
	
