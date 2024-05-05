import java.util.Scanner;

public class Main{

    public static int[] getalphabetCount(String str){
        int[] Count = new int[26];
        for (int i = 0 ; i < str.length(); i++){
            Count[str.charAt(i) - 'a']++;
        }
        return Count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2= sc.nextLine();

        int[] CountA = getalphabetCount(s);
        int[] CountB = getalphabetCount(s2);


        int ans = 0;
        for (int i =0; i<26; i++){
            ans+=Math.abs(CountA[i]-CountB[i]);
        }
        System.out.println(ans);



    }
}