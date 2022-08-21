package step15_backTracking.num_8_14889;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static boolean[] visit;
    public static int[][] statArr;
    public static int MIN = Integer.MAX_VALUE;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        statArr = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                statArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(MIN);
    }

    public static void dfs(int depth, int least) {
        if (depth == N/2) {
            int team1=0, team2=0;
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(visit[i] && visit[j]){
                        team1 += statArr[i][j];
                    } else if(visit[i] == visit[j]){
                        team2 += statArr[i][j];
                    }
                }
            }
            MIN = Math.min(MIN, Math.abs(team1 - team2));
            return;
        }

        for (int i = least; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(depth + 1, i+1);
                visit[i] = false;
            }
        }
    }
}




