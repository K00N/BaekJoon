package step7_basicMath1.num_6_2775;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }


        for(int i = 1; i < 15; i ++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }


        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(Integer.toString(APT[k][n]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}