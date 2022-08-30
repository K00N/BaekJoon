package step16_dynamicProgramming.num_10_10844;

import java.io.*;

public class Main {
    public static int count=0;
    public static int[][] sumArr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        sumArr = new int[n][10];
        for(int i=0; i<10; i++){
            sumArr[0][i] = 1;
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<10; j++){
                if(j==0){sumArr[i][0]=sumArr[i-1][1];}
                else if(j==9){sumArr[i][9]=sumArr[i-1][8];}
                else {
                    sumArr[i][j] = (sumArr[i-1][j-1] + sumArr[i-1][j+1])%1000000000;
                }
            }
        }
        int answer =0;
        for(int i=1;i<10;i++){
            answer += sumArr[n-1][i];
            answer = answer%1000000000;
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}