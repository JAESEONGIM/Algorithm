import java.util.*;
import java.io.*;
public class Main {

    static int[][] map;
    static int N,M,cnt;
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int max;
    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});

        visited[x][y] = true;
        cnt = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int k= 0; k < size; k++) {
                int now[] = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = now[0] + dx[i];
                    int ny = now[1] + dy[i];
                    if (nx >= 0 && ny >= 0 && nx < N && ny < M
                            && !visited[nx][ny] && map[nx][ny] == 'L') {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});

                    }
                }
            }
            if(!q.isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }
    public  static void  main(String args[]) throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        map = new int[N][M];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                if(map[i][j] == 'L'){
                    visited = new boolean[N][M];
                    int res = bfs(i,j);
                    if(max < res){
                        max = res;
                    }
                }
            }
        }
        System.out.println(max);
        }

    }

