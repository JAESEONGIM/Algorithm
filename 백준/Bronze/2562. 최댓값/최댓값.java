


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ArrayList arr = new ArrayList();
		
		//int num = 0; 
		int max = 0; //최댓값
		int ind = 0; //요소 위치
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0 ; i<9; i++) {
			arr[i] = Integer.parseInt(scn.nextLine());
			if(arr[i] > max) {
				max = arr[i];
				ind = i+1;
			}
		}
		System.out.println(max);
		System.out.println(ind);
	}
}
