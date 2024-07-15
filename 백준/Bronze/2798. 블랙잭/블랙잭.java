import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int result = 0;
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int[] arr = new int[x];
        String[] str= br.readLine().split(" ");
        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < x - 2; i++) {
            for (int j = i + 1; j < x - 1; j++) {
                for (int k = j + 1; k < x; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (temp == y) {
                        System.out.println(temp);
                        return;
                    } else {
                        if (temp > result && temp < y) {
                            result = temp;
                        }
                    }
                }
            }
        }System.out.println(result);
    }
}




