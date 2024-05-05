import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2= sc.nextLine();

        int[] CountA = new int[26];
        int[] CountB = new int[26];
        for (int i = 0 ; i < s.length(); i++){
            CountA[s.charAt(i) - 'a']++;
        }
        for (int i = 0 ; i < s2.length(); i++){
            CountB[s2.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i =0; i<26; i++){
            if (CountA[i] > CountB[i]){
                ans += CountA[i] - CountB[i];
            } else if (CountB[i] > CountA[i]) {
                ans += CountB[i] - CountA[i];

            }
        }
        System.out.println(ans);



    }
}