package step16_dynamicProgramming.num_3_1904;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] fiboArr = new int[N+1];
        fiboArr[0] = 1;
        fiboArr[1] = 1;
        for(int i=2; i<=N; i++){
            fiboArr[i] = (fiboArr[i-2] + fiboArr[i-1])%15746;
        }

        bw.write(Integer.toString(fiboArr[N]));
        bw.flush();
        bw.close();
    }
}