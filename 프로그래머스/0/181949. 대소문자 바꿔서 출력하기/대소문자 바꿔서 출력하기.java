import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] s = new String[a.length()];
        
        for(int i = 0; i < a.length();i++){
            s[i] = String.valueOf(a.charAt(i));
            if(s[i].matches("[A-Z]")){
                System.out.print(s[i].toLowerCase());
            }
            else {
                System.out.print(s[i].toUpperCase());
                 }   
            }
        }
        
    }
