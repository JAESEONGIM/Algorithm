import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static int[][][] map;
    static boolean[][] visited;
    static int M, N, H, cnt;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static boolean no;
    static Queue<int[]> q = new LinkedList<>();

    public static void bfs() {

        Queue<int[]> q2 = new LinkedList<>();
//        q.add(new int[]{x, y});
//        visited[x][y] = true;
        while (!q.isEmpty()) {
            int now[] = q.poll();
            for (int i = 0; i < 6; i++) {

                int nz = now[0] + dz[i];
                int nx = now[1] + dx[i];
                int ny = now[2] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M &&
                        nz >=0 && nz < H
                        && map[nz][nx][ny] == 0) {
                    map[nz][nx][ny] = 1;
                    q2.add(new int[]{nz, nx, ny});
                }
            }
            if (q.isEmpty()) {
                if (!q2.isEmpty()) {
                    cnt++;
                    while (!q2.isEmpty()) {
                        q.add(q2.poll());
                    }
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] s = (br.readLine().split(" "));
        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        H = Integer.parseInt(s[2]);
        map = new int[H][N][M];

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    map[k][i][j] = Integer.parseInt(str[j]);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[k][i][j] == 1) {
                        q.add(new int[]{k, i, j});

                    }
                }
            }
        }
            bfs();
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[k][i][j] == 0) {
                        no = true;
                    }
                }
            }
        }
            if (no) {
                System.out.println(-1);
            } else {
                System.out.println(cnt);
            }
        
        }
    }

