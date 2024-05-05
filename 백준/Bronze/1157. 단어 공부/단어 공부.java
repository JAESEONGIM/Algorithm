import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2 = s.toUpperCase();
        int max = 0;
        int[] count = new int[26];
        int maxindex =0;
        char maxalphabet = '?';
        for (int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            count[ch-'A']++;

        }
        for (int i = 0 ; i < 26; i++){
            if (max < count[i]){
                max = count[i];
                maxalphabet = (char)('A'+ i);
            } else if (count[i] == max) {
                maxalphabet = '?';
            }
        }
        System.out.println((char)(maxalphabet));






    }
}