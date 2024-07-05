import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static boolean[] visited;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        line = sc.nextInt();
        start = sc.nextInt();

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];

        for(int i = 0; i < line; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(start);
        System.out.println();

        visited = new boolean[node+1];
        bfs(start);

        System.out.println();
        }

        public static void dfs(int start){
        visited[start] = true;
        System.out.print(start+" ");
        if(start == arr.length) return;
            for(int j = 1; j < arr.length; j++){
                if(arr[start][j] == 1 && !visited[j]) {
                    dfs(j);
                }
            }

    }
    public static void bfs(int start){
        q.add(start);
        visited[start] = true;
        System.out.print(start+" ");

        while(!q.isEmpty()){  // q가 비어있으면 다 출력된것이므로 종료
            int n = q.poll();
            for(int i = 1; i < arr.length; i++){
                if(arr[n][i] == 1 && !visited[i]){
                    visited[i] = true;
                    System.out.print(i+ " ");
                    q.add(i);
                }
            }




        }

    }
}