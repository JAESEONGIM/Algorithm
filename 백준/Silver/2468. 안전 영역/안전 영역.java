import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int cnt;

    public static void bfs(int x, int y,int height){
        visited[x][y] = true;
        Queue<int[]> q  = new LinkedList<>();
        q.add(new int[]{x,y});

        while(!q.isEmpty()){
//            cnt++;
            int now[] =  q.poll();
            for(int i = 0; i < 4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < N &&
                        map[nx][ny] > height && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
    public static void main(String args[])
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(s[j]);
                //입력받는 수 중에 제일 큰 수를 maxheight 로 잡고 추후에 0부터 maxheight 까지반복문
                if (map[i][j] > maxHeight) {
                    maxHeight = map[i][j];
                }

            }
        }
        int max = 0;
        List<Integer> arr = new ArrayList<>();
        // 모든 지역 탐색 하기
        for (int height = 0; height <= maxHeight; height++) {
            visited = new boolean[N][N];
            cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    //안전영역 탐지
                    if (map[i][j] > height && !visited[i][j]) {
                        cnt++;  // 영역의 개수세는 것. 탐색 시작할때 Cnt++로 하면 탐색끝나면 한 영역에 대해 탐색 끝난것.
                        bfs(i, j, height);
                    }

                }

            }
            if(max < cnt){
                max = cnt;
            }

        }

        System.out.println(max);
        }
    }


