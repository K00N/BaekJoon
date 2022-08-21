package step15_backTracking.num_4_15652;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(N, M, 0, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth, int least) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = least; i < N; i++) {
                arr[depth] = i + 1;
                dfs(N, M, depth + 1, i);
        }
    }
}
