

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<>();
		String s = sc.next().toUpperCase();
		//문자열 입력받기
		//char[] arr = new char[s.length()];
		// 문자열을 문자단위로 떼어서 넣을 문자형 배열 선언
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		int maxv = 0;
		Character maxk = null;
		boolean multipleMax =false;
		for(Entry<Character, Integer> entry : map.entrySet()) {
			//if()
			if(entry.getValue() > maxv) {
				maxv=entry.getValue();
				maxk = entry.getKey();
				 multipleMax = false;
			}else if(entry.getValue() == maxv) {
				multipleMax = true;
			}
		}
			if(multipleMax) {
				System.out.println("?");
			}else {
				System.out.println(maxk);
			}
		}
		
		
		}
	

