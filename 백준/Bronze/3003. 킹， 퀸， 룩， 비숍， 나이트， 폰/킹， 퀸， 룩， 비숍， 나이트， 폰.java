

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
    	int[] arr = {1,1,2,2,2,8};
    	int[] arr2 = new int [6];
    	for(int i = 0; i < 6; i++) {
    		arr2[i] = sc.nextInt();
    		if(arr2[i] < arr[i]) {
    			System.out.print(arr[i]-arr2[i]+" ");
    		}else if(arr2[i]==arr[i]) {
    			System.out.print(0+" ");
    		}else {
    			System.out.print(arr[i]-arr2[i]+" ");
    		}
    	}
    	
    }
}