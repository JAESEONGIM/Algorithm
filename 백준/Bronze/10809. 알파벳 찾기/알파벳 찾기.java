

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] arr2 = new int[26];
		
		for(int i = 0; i < 26; i++) {
			arr2[i]=-1;
			for(int j = 0; j < s.length(); j++) {
				if(arr[i] == s.charAt(j)) {
					arr2[i]=j;
					break;
				}
				
			}
				
				
			
	}for(int i=0; i<26; i++) {
		System.out.println(arr2[i]);
	}
		 
	
}
}
