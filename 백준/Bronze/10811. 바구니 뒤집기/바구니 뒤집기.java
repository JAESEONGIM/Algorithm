

import java.util.Scanner;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		//바구니에 1번부터 N번까지 번호 넣어주기
		for(int a = 0; a < n; a++) {
			arr[a] = a+1;
		}
		
		//두번쨰 입력 - 바구니 순서 역순 범위 지정하기
		for(int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
				reverseRange(arr, i,j);
			}
			
		
		for(int a = 0 ; a < n; a++) {
			System.out.print(arr[a] + " ");
		}
		
	
	
	}
	

	private static void reverseRange(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i-1];
			arr[i-1]=arr[j-1];
			arr[j-1]=temp;
			i++;
			j--;
		}
		
	}
	
}
//1 2 3 4 5

//2 ~ 5를 역순으로 바꾸기

//2 3 4 5 -> 5 4 3 2

//2를 temp에 저장
//5를 앞으로 
//2를 5자리에 넣기 

//-> 5 3 4 2
//i++;

//3을 temp에 저장
//2를앞으로 -> 잘못됐다. -> j--를 해줘야함

//-> 5 3 4 2
//++;
//j--;

//3을 temp에 저장
//4를 앞으로 
//3을 4자리에 넣기

//-> 5 4 3 2

