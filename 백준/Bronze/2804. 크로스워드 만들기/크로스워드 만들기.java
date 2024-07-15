import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = s[0].length();
        int m = s[1].length();
        char[] a = new char[n];
        char[] b = new char[m];
        char[][]map  = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(map[i], '.');
        }
        for(int i = 0; i < s[0].length(); i++){
           a[i] = s[0].charAt(i);
        }
        for(int i = 0; i < s[1].length(); i++){
            b[i] = s[1].charAt(i);
        }



        loop : for(int i = 0;  i < n; i++){
            for(int j = 0; j < m; j++){
                if(s[0].charAt(i)==s[1].charAt(j)) {
                    map[j] = a;

                    for (int k = 0; k < m; k++) {
                        map[k][i] = b[k];
                    }
                    break loop;
                }


            }

        }
        for(int i = 0; i < m; i++){
            for(int j = 0;  j <n; j++){
                System.out.print(map[i][j]);

            }
            System.out.println();
        }

    }
}
