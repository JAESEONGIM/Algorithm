

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("A", 2);
		hashMap.put("B", 2);
		hashMap.put("C", 2);
		
		hashMap.put("D", 3);
		hashMap.put("E", 3);
		hashMap.put("F", 3);
		
		hashMap.put("G", 4);
		hashMap.put("H", 4);
		hashMap.put("I", 4);
		
		hashMap.put("J", 5);
		hashMap.put("K", 5);
		hashMap.put("L", 5);
		
		hashMap.put("M", 6);
		hashMap.put("N", 6);
		hashMap.put("O", 6);
		
		hashMap.put("P", 7);
		hashMap.put("Q", 7);
		hashMap.put("R", 7);
		hashMap.put("S", 7);
		
		hashMap.put("T", 8);
		hashMap.put("U", 8);
		hashMap.put("V", 8);
		
		hashMap.put("W", 9);
		hashMap.put("X", 9);
		hashMap.put("Y", 9);
		hashMap.put("Z", 9);
		
		
		
		String s = sc.next();
		int value = 0;
		int sec = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String key = String.valueOf(c);
			value = hashMap.get(key);
			sec = sec + value+1;
		}
		
		System.out.println(sec);

		
	}
}
