
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
    	String s = sc.nextLine();
    	
    	String reversed_s = new StringBuilder(s).reverse().toString();
    	
    	
    	if(s.equals(reversed_s)) {
    		System.out.println(1);
    	}else {
    		System.out.println(0);
    	}
    	
    	}
    	
    }
