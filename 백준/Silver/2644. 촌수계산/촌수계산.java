import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N;
    static int start;
    static int end;
    static int rs;
    static int result=-1;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        start = sc.nextInt();
        end = sc.nextInt();
        rs = sc.nextInt();

        for(int i = 0; i < rs; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;

        }
        dfs(start,0);
        System.out.println(result);
    }

    public static void dfs(int s,int depth){
        visited[s] = true;
//        result++;

        if(s==end) {
            result = depth;
            return;
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[s][i]==1 && !visited[i]){
                dfs(i,depth + 1);
            }
        }
    }
}
