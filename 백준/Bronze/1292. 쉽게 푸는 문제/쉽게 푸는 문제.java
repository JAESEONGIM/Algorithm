import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> list = new ArrayList<>();
    String[] s = br.readLine().split(" ");
    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);

    for(int i = 1; i < 1000; i++ ){
        for(int j = 0; j < i; j++){
            list.add(i);
        }
    }
    int sum = 0;
    for(int i = a; i <= b; i++){
        sum = sum + list.get(i-1);
    }
    
    System.out.println(sum);



    }
}
