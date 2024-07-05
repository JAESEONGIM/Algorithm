import java.util.Scanner;

public class    Main {


    static boolean[] visited;
    static int[][] arr;
    static int N;
    static int line;
    static int count=0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        line = sc.nextInt();



        arr = new int[N+1][N+1];
        visited = new boolean[N+1];


        for(int i = 0; i < line; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(1);
        System.out.println(count-1);
        }

    public static void dfs(int start){
        visited[start] = true;
        count++;
        if(start==arr.length) return;
        for(int j = 1; j < arr.length; j++){
            if(arr[start][j]==1 && !visited[j]){
                dfs(j);
            }
        }
    }
}
