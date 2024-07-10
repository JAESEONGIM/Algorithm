import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static char[][] map1;
    static char[][] map2;
    static boolean[][] visited;
    static int cnt;
    static int eyecnt;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void bfs1(int x, int y, char ch) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int now[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N
                        && !visited[nx][ny] && ch == map1[nx][ny]) {
                    q.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                    }
                }
            }
        }

    public static void bfs2(int x, int y, char ch) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;


        while (!q.isEmpty()) {
            int now[] = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N
                        && !visited[nx][ny] && map2[nx][ny] == ch) {
                        q.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map1 = new char[N][N];
        map2  = new char[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map1[i][j] = s.charAt(j);
                if(s.charAt(j) == 'R'){
                    map2[i][j] = 'G';
                }else{
                    map2[i][j] = s.charAt(j);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        cnt++;
                        bfs1(i, j, map1[i][j]);
                    }
                }
            }
            list.add(cnt);
            cnt = 0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        cnt++;
                        bfs2(i, j, map2[i][j]);
                }
            }
        }
        list.add(cnt);
        for(int i : list)
        System.out.println(i);
    }
}
