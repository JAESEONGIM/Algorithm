import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = new char[a.length()];
        for(int i = 0; i < a.length(); i++){
            ch[i] = a.charAt(i);
            System.out.println(ch[i]);
        }
    }
}