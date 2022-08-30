package step16_dynamicProgramming.num_01_24416;

import java.io.*;

public class Main {
    public static int[] fiboArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        fiboArr = new int[N+1];
        fiboArr[1] = 1;
        fiboArr[2] = 1;
        for(int i=3; i<=N; i++){
            fiboArr[i] = fiboArr[i-2] + fiboArr[i-1];
        }

        bw.write(Integer.toString(fiboArr[N])+" ");
        bw.write(Integer.toString(N-2));
        bw.flush();
        bw.close();
    }
}





