import java.util.*;
import java.io.*;
public class Main {
    static int result=0;

    public static void main(String args[]) throws IOException{
        BufferedReader br =
                new BufferedReader
                        (new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;
        int min = 0;
        //10개 입력받기
        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0;  i < 10; i++){
            sum = sum + arr[i];
            int diff = Math.abs(100 - sum);
            if(diff <= Math.abs(100 - result)){
                result  = sum;
            }
        }
        System.out.println(result);

    }
}
