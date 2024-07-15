import java.util.*;
import java.io.*;

public class Main {
    static int max = 0;
    static int result;
    public static void main(String args[]) throws IOException{
            BufferedReader br =
                    new BufferedReader
                            (new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            String[] s = br.readLine().split(" ");

            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(s[i]);
            }
List<Integer> list = new ArrayList<>();
                for(int i = 0; i < N-1; i++){
                    if(arr[i] < arr[i+1]){
                        max =  max + arr[i+1] - arr[i];
                    }
                    else{
                        max = 0;
                    }
                    result = Math.max(result, max);
                }

                System.out.println(result);

    }
}
