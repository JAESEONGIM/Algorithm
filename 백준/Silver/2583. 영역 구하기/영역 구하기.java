import java.util.*;
import java.io.*;
public class Main {
    static int M, N, K;
    static int[][]map;
    static boolean[][] visited;
    static int cnt=0;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};


    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        while(!q.isEmpty()){
            cnt++;
            int now[] = q.poll();
            for(int i = 0; i < 4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < M && ny < N
                && map[nx][ny] == 0 && !visited[nx][ny]){
                    q.add(new int[]{nx,ny});
                    visited[nx][ny] = true;

                }
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        K = Integer.parseInt(s[2]);
        map = new int[M][N];
        visited = new boolean[M][N];
        int ax = 0;
        int bx = 0;
        int ay = 0;
        int by = 0;

        for(int i = 0; i < K; i++) {
            String[] str = br.readLine().split(" ");
            ax = Integer.parseInt(str[0]);
            ay = Integer.parseInt(str[1]);
            bx = Integer.parseInt(str[2]);
            by = Integer.parseInt(str[3]);

            for (int x = ay; x < by; x++) {
                for (int y = ax; y < bx; y++) {
                    map[x][y] = 1;
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 0 && !visited[i][j]){
                    cnt = 0;
//                    visited[i][j] = true;
                    bfs(i,j);
                    arr.add(cnt);

                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());

        for(int i : arr){
            System.out.print(i+" ");
        }



    }
}
