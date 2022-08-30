package step16_dynamicProgramming.num_04_9461;

import java.io.*;

public class Main {
    public static long[] fiboArr = new long[101];

    public static void main(String[] args) throws IOException {
        fiboArr[1] = 1L;
        fiboArr[2] = 1L;
        fiboArr[3] = 1L;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int N;
        int t=0;
        while (t<testCase) {
            N = Integer.parseInt(br.readLine());
            getFiboArr(N);
            bw.write(Long.toString(getFiboArr(N)));
            bw.newLine();
            t++;
        }

        bw.flush();
        bw.close();
    }
    public static long getFiboArr(int n){
        if(fiboArr[n]==0) {
            fiboArr[n] = getFiboArr(n-2)+getFiboArr(n-3);
        }
        return fiboArr[n];
    }
}
