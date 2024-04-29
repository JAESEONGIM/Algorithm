import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		int[][] arr3 = new int[n][m];
		
		int a = 0;
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < m; k++) {
				a = sc.nextInt();
				if(a<=100)
					arr1[i][k]=a;
				
			}
		}
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < m; k++) {
				a = sc.nextInt();
				if(a<=100)
					arr2[i][k]=a;
				
			}
		}
		
		
		
		
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < m; k++) {
				System.out.print(arr1[i][k] +arr2[i][k]+ " ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
