import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int M,N,cnt;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean no;
    static Queue<int[]> q = new LinkedList<>();

    public static void bfs() {

        Queue<int[]> q2 = new LinkedList<>();
//        q.add(new int[]{x, y});
//        visited[x][y] = true;
        while(!q.isEmpty()) {
            int now[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M
                        && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    q2.add(new int[]{nx, ny});
                }
            }
            if(q.isEmpty()) {
                if(!q2.isEmpty()) {
                    cnt++;
                    while (!q2.isEmpty()) {
                        q.add(q2.poll());
                    }
                }


            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

    String[] s = (br.readLine().split(" "));
    M = Integer.parseInt(s[0]);
    N = Integer.parseInt(s[1]);
    map = new int[N][M];
    visited = new boolean[N][M];

    for(int i = 0; i < N; i++){
        String[] str  = br.readLine().split(" ");
        for(int j = 0; j < M; j++){
            map[i][j] = Integer.parseInt(str[j]);
        }
    }
    List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
              if(map[i][j] == 1 ){
                  q.add(new int[]{i,j});

              }
            }
        }
        bfs();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(map[i][j] == 0 ){
                     no = true;
                }
            }
        }
        if(no){
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }





    }
}
