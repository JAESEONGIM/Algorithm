import java.util.*;
import java.io.*;

public class Main {
    static int T;
    static int M,N,K;
    static int map[][];
    static boolean visited[][];
    static int[] dx = {0,0,1,-1};
    static int[] dy = {-1,1,0,0};
    static int cnt;

    public static void bfs(int x,int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            cnt++;
            int[] now = q.poll();

            for(int i = 0; i < 4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx >= 0 && ny >= 0 &&
                nx < M && ny < N &&
                map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }

        }
    }


    public static void main(String args[]) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for(int a = 0; a < T; a++) {
            String[] s = br.readLine().split(" ");
            M = Integer.parseInt(s[0]);
            N = Integer.parseInt(s[1]);
            map = new int[M][N];
            visited = new boolean[M][N];
            K = Integer.parseInt(s[2]);

            for (int i = 0; i < K; i++) {
                String[] str = br.readLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                map[x][y] = 1;
            }

            ArrayList<Integer> arr = new ArrayList<>();
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        bfs(x,y);
                        arr.add(cnt);
                        cnt = 0;
                    }
                }
            }
            System.out.println(arr.size());

        }
    }

}
